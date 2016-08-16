/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem;

import com.gagan.chess.problem.types.Position;
import java.util.Set;

/**
 * Common utility methods for Chess program
 * @author gagssing
 */
public class Util {
    /**
     * Method to create a representation of set of Positions
     * @param positions Set of position objects to be printed
     * @return String representing the position notations in square brackets and comma separated
     */
    public static String getPrintableSet(Set<Position> positions){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Position pos:positions){
            sb.append(pos.toString());
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    
}
