/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem;

import com.gagan.chess.problem.types.Position;

/**
 * Represents the Chessboard with Pieces on board positions with each type.
 * @author gagssing
 */
public class ChessBoard {
    public static final int SIZE = 8; // Since we are considering only one size ChessBoard
   
    private final Piece[][] pieces; // ChessBoard contains pieces

    public ChessBoard(){
        pieces=new Piece[SIZE][SIZE];
    }
    
    /**
     * The method places one piece at time on the board according to its given position for the initial setup
     * @param piece Piece i.e King etc. to be placed on the ChessBoard
     */
    public void add(Piece piece){
        final int row = piece.getPosition().getRowIndex();
        final int column = piece.getPosition().getColumnIndex();
        pieces[row][column]= piece;
    }
    /**
     * provides the backing Array which is storing the pieces.
     * @return 2d array of pieces
     */
    public Piece[][] getPieces() {
        return pieces;
    }
    /**
     * 
     * @param row row in the 2d array
     * @param column column in the 2d array
     * @return each Piece according to the row-column indexes.
     */
    public Piece getPiece(int row, int column){
        return pieces[row][column];
    }
    
    /**
     * 
     * @param pos Position object from where the Piece is required
     * @return Piece from the array respective to the provided Position object
     */
    public Piece getPiece(Position pos){
        return getPiece(pos.getRowIndex(), pos.getColumnIndex());
    }
    
}
