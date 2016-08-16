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
public class Bishop extends Piece {

    @Override
    public String getType() {
        return "Bishop";
    }

    @Override
    public String getTypeNotation() {
        return "B";
    }

    /**
     * Logic specific for the Bishop
     *
     * @param board current state of the board
     * @return
     */
    @Override
    public Set<Position> getPossiblePositions(ChessBoard board) {

        Set<Position> possiblePositions = new TreeSet<>();
// Bishops can move in all 4 directions diagonally 
        final Position currentPosition = this.getPosition();

        Position referencePosition = currentPosition; // Start from current position
        while (referencePosition.isValid()) {// Loop for looking places towards right diagonally up
            if (!currentPosition.equals(referencePosition)) {// If not the same position
                if (validateAdd(referencePosition, possiblePositions, board)) { // the method returns whether to stop the loop
                    break;
                }
            }
            referencePosition = referencePosition.upRow().rightColumn();
        }

        referencePosition = currentPosition;

        while (referencePosition.isValid()) {// Loop for looking places towards left diagonally up
            if (!currentPosition.equals(referencePosition)) {// If not the same position
                if (validateAdd(referencePosition, possiblePositions, board)) {
                    break;
                }
            }
            referencePosition = referencePosition.upRow().leftColumn();
        }

        referencePosition = currentPosition;
        while (referencePosition.isValid()) {// Loop for looking places towards right diagonally down
            if (!currentPosition.equals(referencePosition)) {// If not the same position
                if (validateAdd(referencePosition, possiblePositions, board)) {
                    break;
                }
            }
            referencePosition = referencePosition.downRow().rightColumn();
        }

        referencePosition = currentPosition;
        while (referencePosition.isValid()) {// Loop for looking places towards left diagonally down
            if (!currentPosition.equals(referencePosition)) {// If not the same position
                if (validateAdd(referencePosition, possiblePositions, board)) {
                    break;
                }
            }
            referencePosition = referencePosition.downRow().leftColumn();
        }
        return possiblePositions;
    }

    /**
     * Delegated common logic for each of the direction type
     *
     * @param referencePosition
     * @param possiblePositions
     * @param board
     * @return
     */
    private boolean validateAdd(Position referencePosition, Set<Position> possiblePositions, ChessBoard board) {
        boolean stopProceeding = false;
        // It cannot crossover the same color
        if (board.getPiece(referencePosition) != null && board.getPiece(referencePosition).getColor().equals(this.getColor())) {
            // Same color piece on the way
            stopProceeding = true;
            return stopProceeding;
        }
        if (board.getPiece(referencePosition) == null) { // If the place is empty or a different color Piece is there
            possiblePositions.add(referencePosition);
        } else if (!board.getPiece(referencePosition).getColor().equals(this.getColor())) {
            possiblePositions.add(referencePosition);
            stopProceeding = true;
            return stopProceeding;
        }

        /*
                if (board.getPiece(referencePosition) == null || !board.getPiece(referencePosition).getColor().equals(this.getColor())) { // If the place is empty or a different color Piece is there
                    possiblePositions.add(referencePosition);
                }
         */
        return false;
    }
}
