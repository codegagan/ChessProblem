/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.piecetypes;

import com.gagan.chess.problem.piecetypes.Knight;
import com.gagan.chess.problem.ChessBoard;
import com.gagan.chess.problem.Color;
import com.gagan.chess.problem.types.Position;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gagssing
 */
public class KnightTest {
    
    public KnightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getType method, of class Knight.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Knight instance = new Knight();
        String expResult = "Knight";
        String result = instance.getType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTypeNotation method, of class Knight.
     */
    @Test
    public void testGetTypeNotation() {
        System.out.println("getTypeNotation");
        Knight instance = new Knight();
        String expResult = "N";
        String result = instance.getTypeNotation();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPossiblePositions method, of class Knight.
     */
    @Test
    public void testGetPossiblePositions() {
        System.out.println("getPossiblePositions");
        ChessBoard board = new ChessBoard();
        Knight instance = new Knight();
        instance.setColor(Color.WHITE);
        instance.setPosition(new Position("d5"));
        Set<Position> expResult = new TreeSet<>();
        expResult.addAll(Arrays.asList(new Position("b4"),new Position("b6"),new Position("c3"),new Position("c7"),new Position("e3"),new Position("e7"), new Position("f4"),new Position("f6")));
        Set<Position> result = instance.getPossiblePositions(board);
        assertEquals(expResult, result);
        
    }
    
}
