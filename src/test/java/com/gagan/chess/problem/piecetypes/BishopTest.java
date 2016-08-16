/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.piecetypes;

import com.gagan.chess.problem.piecetypes.Bishop;
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
public class BishopTest {
    
    public BishopTest() {
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
     * Test of getType method, of class Bishop.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Bishop instance = new Bishop();
        String expResult = "Bishop";
        String result = instance.getType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTypeNotation method, of class Bishop.
     */
    @Test
    public void testGetTypeNotation() {
        System.out.println("getTypeNotation");
        Bishop instance = new Bishop();
        String expResult = "B";
        String result = instance.getTypeNotation();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPossiblePositions method, of class Bishop.
     */
    @Test
    public void testGetPossiblePositions() {
        System.out.println("getPossiblePositions");
        ChessBoard board = new ChessBoard();
        Bishop instance = new Bishop();
        instance.setColor(Color.WHITE);
        instance.setPosition(new Position("e3"));
        Set<Position> expResult = new TreeSet<>();
        expResult.addAll(Arrays.asList(new Position("a7"),new Position("b6"),new Position("c1"),new Position("c5"),new Position("d2"),new Position("d4"), new Position("f2"),new Position("f4"), new Position("g1"),new Position("g5"), new Position("h6")));
        Set<Position> result = instance.getPossiblePositions(board);
        assertEquals(expResult, result);
    }
    
}
