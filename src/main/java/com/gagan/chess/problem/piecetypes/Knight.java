/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.piecetypes;

import com.gagan.chess.problem.ChessBoard;
import com.gagan.chess.problem.Piece;
import com.gagan.chess.problem.types.Position;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author gagssing
 */
public class Knight extends Piece {

    @Override
    public String getType() {
        return "Knight";
    }

    @Override
    public String getTypeNotation() {
        return "N";
    }

    /**
     * Method provides the Knight specific way of paths on the given board
     *
     * @param board
     * @return
     */
    @Override
    public Set<Position> getPossiblePositions(ChessBoard board) {
        Set<Position> possiblePositions = new TreeSet<>(); // To keep them sorted for display
        final Position currentPosition = this.getPosition();
        //Knight moves in L shape directions all sides, take the case of each.
        Position up = currentPosition.upRow().upRow(); // Two times up direction
        Position upLeft = up.leftColumn(); // One left direction
        validateAdd(upLeft, possiblePositions, board);
        validateAdd(up.rightColumn(), possiblePositions, board);

        Position down = currentPosition.downRow().downRow();
        validateAdd(down.leftColumn(), possiblePositions, board);//down left
        validateAdd(down.rightColumn(), possiblePositions, board);// down right

        Position left = currentPosition.leftColumn().leftColumn(); //Move two left.
        validateAdd(left.upRow(), possiblePositions, board);
        validateAdd(left.downRow(), possiblePositions, board);

        Position right = currentPosition.rightColumn().rightColumn();
        validateAdd(right.upRow(), possiblePositions, board);
        validateAdd(right.downRow(), possiblePositions, board);
        return possiblePositions;
    }

    /**
     * Method to validate and add if true, to the possible moves
     *
     * @param position
     * @param positions
     * @param board
     */
    private void validateAdd(Position position, Set<Position> positions, ChessBoard board) {
        if (position.isValid()) { // If not out of board boundries
            if (board.getPiece(position) == null || (!board.getPiece(position).getColor().equals(this.getColor()))) {
                positions.add(position);
            }
        }
    }
}
