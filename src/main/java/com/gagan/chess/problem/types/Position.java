/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.types;

import com.gagan.chess.problem.ChessBoard;

/**
 * Provides the conversion between array index and tyro notations, represents the position of Piece
 * @author gagssing
 */
public class Position implements Comparable<Position>{
    private int rowIndex;
    private int columnIndex;
    private String notation;

    
    private char file;
    private int rank;
    
    public Position(String notation){
        if(notation==null || notation.length()!=2){
            throw new IllegalArgumentException("Notation String value is not valid");
        }
        this.notation=notation; // Notation parsing below to get indices
        file = notation.charAt(0);
        rank= Integer.valueOf(notation.substring(1));
        rowIndex=ChessBoard.SIZE-rank;
        columnIndex= file - 'a';
    }
    
    public Position(int row, int column){
        rowIndex=row;
        columnIndex=column;
        // File Rank generation from the indices
        rank=ChessBoard.SIZE-rowIndex;
        file=(char)(columnIndex+'a');
        //String representation
        this.notation=Character.toString(file)+Integer.toString(rank);
    }
    
     // Validation methods based on board size
    public boolean hasValidRowIndex(){
        return rowIndex >=0 && rowIndex <=(ChessBoard.SIZE-1); // Arrays are 0 based
    }
    
    public boolean hasValidColumnIndex(){
        return columnIndex >=0 && columnIndex <=(ChessBoard.SIZE-1);
    }
    
    public boolean hasValidFile(){
        return file>= 'a' && file <='h';
    }
    
    public boolean hasValidRank(){
        return rank >=1 && rank<=ChessBoard.SIZE;
    }
    
    public boolean isValid(){
        return hasValidRank() && hasValidFile() && hasValidColumnIndex() && hasValidRowIndex();
    }
    
     public int getRowIndex() {
        return rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public char getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }
    
    public String getNotation() {
        return notation;
    }
    
    @Override
    public boolean equals(Object object){
        if(object instanceof Position){
            Position pos= (Position)object;
            // comparing index is enough, as either of it cannot be set separately.
            if(pos.getColumnIndex()==this.getColumnIndex() && pos.getRowIndex()==this.getRowIndex()){ 
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return notation.hashCode(); // unique string for each position, lets just use string's haschcode.
    }

    @Override
    public int compareTo(Position o) {
        // Just compare based on notation like e5, a1 etc.
        return this.notation.compareTo(o.getNotation());
    }
    
    // Methods below which return the new Position object relative to current object
    public Position downRow(){
        return new Position(this.getRowIndex()+1,this.getColumnIndex());
    }
    
    public Position upRow(){
        return new Position(this.getRowIndex()-1,this.getColumnIndex());
    }
    
    public Position rightColumn(){ // left,right; When seen from bottom i.e White positions
        return new Position(this.getRowIndex(),this.getColumnIndex()+1);
    }
    
    public Position leftColumn(){
        return new Position(this.getRowIndex(),this.getColumnIndex()-1);
        
    }
    
    public String toString(){
        return getNotation();
    }
}
