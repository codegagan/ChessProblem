/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem;

import com.gagan.chess.problem.types.Position;
import java.util.Set;

/**
 * Class to provide common functionality to child Objects
 *
 * @author gagssing
 */
public abstract class Piece {

    protected Color color;
    protected Position position;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String toString() {
        return color.name() + " " + getTypeNotation() + " on " + position;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Piece){
            Piece p = ((Piece) o);
            return p.getColor().equals(this.getColor()) && p.getPosition().equals(this.getPosition()) && p.getType().equals(this.getType());
        }
        return false;
    }
    // Piece type specific methods, each type must implement
    public abstract String getType();

    public abstract String getTypeNotation();
    // Each Concrete type has to implement its own rules, given a board
    public abstract Set<Position> getPossiblePositions(ChessBoard board);
}
