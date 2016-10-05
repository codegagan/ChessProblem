/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.factories;

import com.gagan.chess.problem.Color;
import com.gagan.chess.problem.Piece;
import com.gagan.chess.problem.Type;
import com.gagan.chess.problem.piecetypes.Bishop;
import com.gagan.chess.problem.piecetypes.Knight;
import com.gagan.chess.problem.piecetypes.Pawn;
import com.gagan.chess.problem.types.Position;

/**
 * Factory class to create Piece objects of various types based on the input
 * values at runtime
 *
 * @author gagssing
 */
public class PieceFactory {

    private PieceFactory() {
        //Avoid Factory objects
    }
/**
 * 
 * @param color color symbol string
 * @param type one character notation of type
 * @param position string notation of position
 * @return Piece object, actually the concrete subtype of Piece
 */
    public static Piece getPiece(Color color, Type type, String position) {
        Piece piece = null;
        switch (type) {// Check the type, accordingly create the subtype objects.
            case BISHOP:
                piece = new Bishop();
                break;
            case KNIGHT:
                piece = new Knight();
                break;
            case PAWN:
                piece = new Pawn();
                break;
            default:
                throw new IllegalArgumentException("Invalid type while creating Piece: " + type);
        }

        final Position pos = new Position(position);
        piece.setPosition(pos);
        piece.setColor(color);
        return piece;
    }

}
