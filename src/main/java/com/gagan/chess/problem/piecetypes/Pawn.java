/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.piecetypes;

import com.gagan.chess.problem.ChessBoard;
import com.gagan.chess.problem.Color;
import com.gagan.chess.problem.Piece;
import com.gagan.chess.problem.types.Position;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author gagssing
 */
public class Pawn extends Piece {

    /**
     * check whether the Pawn is on initial position based on the color
     *
     * @return
     */
    public boolean isOnInitialPosition() {
        if (this.getColor().equals(Color.WHITE) && this.getPosition().getRowIndex() == 6) { // white on second rank
            return true;
        }
        if (this.getColor().equals(Color.BLACK) && this.getPosition().getRowIndex() == 1) { //black on seventh rank
            return true;
        }
        return false;
    }

    @Override
    public String getType() {
        return "Pawn";
    }

    @Override
    public String getTypeNotation() {
        return "P";
    }

    /**
     * Method returns the possible path positions for a Pawn given the Board
     *
     * @param board
     * @return
     */
    @Override
    public Set<Position> getPossiblePositions(ChessBoard board) {
        Set<Position> possiblePositions = new TreeSet<>(); // To keep them sorted for display
        final Position currentPosition = this.getPosition();
        // Main two cases, white and black
        if (this.getColor().equals(Color.WHITE)) {
            Position up = currentPosition.upRow();
            if (up.isValid() && isEmptyPositionOnBoard(up, board)) { //If one move empty then only it can move further, be it white or black
                validateAdd(up, possiblePositions);
                if (up.upRow().isValid() && this.isOnInitialPosition() && isEmptyPositionOnBoard(up.upRow(), board)) {
                    validateAdd(up.upRow(), possiblePositions);
                }
            }
            // Capture Cases
            Position upLeft = up.leftColumn();
            if (upLeft.isValid() && !isEmptyPositionOnBoard(upLeft, board) && (!isSameColor(upLeft, board))) {
                validateAdd(upLeft, possiblePositions);
            }
            Position upRight = up.rightColumn();
            if (upRight.isValid() && !isEmptyPositionOnBoard(upRight, board) && (!isSameColor(upRight, board))) {
                validateAdd(upRight, possiblePositions);
            }

        } else {// Only two color allowed, this is by default Black
            Position down = currentPosition.downRow();
            if (down.isValid() && isEmptyPositionOnBoard(down, board)) { //If one move empty then only it can move further, be it white or black
                validateAdd(down, possiblePositions);
                if (down.downRow().isValid() && this.isOnInitialPosition() && isEmptyPositionOnBoard(down.downRow(), board)) {
                    validateAdd(down.downRow(), possiblePositions);
                }
            }
            // Capture Cases
            Position downLeft = down.leftColumn();
            if (downLeft.isValid() && !isEmptyPositionOnBoard(downLeft, board) && (!isSameColor(downLeft, board))) {
                validateAdd(downLeft, possiblePositions);
            }
            Position downRight = down.rightColumn();
            if (downRight.isValid() && !isEmptyPositionOnBoard(downRight, board) && (!isSameColor(downRight, board))) {
                validateAdd(downRight, possiblePositions);
            }
        }
        return possiblePositions;
    }

    //Deligation of logic
    private void validateAdd(Position position, Set<Position> positions) {
        if (position.isValid()) {
            positions.add(position);
        }
    }

    private boolean isEmptyPositionOnBoard(Position position, ChessBoard board) {
        return (board.getPiece(position) == null);
    }

    private boolean isSameColor(Position position, ChessBoard board) {
        return (board.getPiece(position).getColor().equals(this.getColor()));
    }
}
