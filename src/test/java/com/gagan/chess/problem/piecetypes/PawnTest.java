/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.piecetypes;

import com.gagan.chess.problem.piecetypes.Pawn;
import com.gagan.chess.problem.ChessBoard;
import com.gagan.chess.problem.Color;
import com.gagan.chess.problem.types.Position;
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
public class PawnTest {
    
    public PawnTest() {
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
     * Test of isOnInitialPosition method, of class Pawn.
     */
    @Test
    public void testIsOnInitialPosition() {
        System.out.println("isOnInitialPosition");
        Pawn instance = new Pawn();
        instance.setColor(Color.WHITE);
        instance.setPosition(new Position("d2"));
        boolean expResult = true;
        boolean result = instance.isOnInitialPosition();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getType method, of class Pawn.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Pawn instance = new Pawn();
        String expResult = "Pawn";
        String result = instance.getType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTypeNotation method, of class Pawn.
     */
    @Test
    public void testGetTypeNotation() {
        System.out.println("getTypeNotation");
        Pawn instance = new Pawn();
        String expResult = "P";
        String result = instance.getTypeNotation();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPossiblePositions method, of class Pawn.
     */
    @Test
    public void testGetPossiblePositions() {
        System.out.println("getPossiblePositions");
        ChessBoard board = new ChessBoard();
        Pawn instance = new Pawn();
        instance.setColor(Color.WHITE);
        instance.setPosition(new Position("e2"));
        Set<Position> set = new TreeSet<>();
        set.add(new Position("e3"));
        set.add(new Position("e4"));
        Set<Position> expResult = set;
        Set<Position> result = instance.getPossiblePositions(board);
        assertEquals(expResult, result);
        
    }
    
}
