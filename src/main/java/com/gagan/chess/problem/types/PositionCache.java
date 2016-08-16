/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.types;

import java.util.HashMap;

/**
 * We could sometimes have created duplicate objects while tracing the paths for pieces, we could same them and reuse with cache here
 * @author gagssing
 */
public class PositionCache {
    private HashMap<String,Position> cache = new HashMap<>();
    // Can be implemented later to make program more efficient.
}
