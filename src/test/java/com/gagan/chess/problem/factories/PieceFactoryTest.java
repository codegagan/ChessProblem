/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.factories;

import com.gagan.chess.problem.factories.PieceFactory;
import com.gagan.chess.problem.Color;
import com.gagan.chess.problem.Piece;
import com.gagan.chess.problem.Type;
import com.gagan.chess.problem.piecetypes.Pawn;
import com.gagan.chess.problem.types.Position;
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
public class PieceFactoryTest {
    
    public PieceFactoryTest() {
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
     * Test of getPiece method, of class PieceFactory.
     */
    @Test
    public void testGetPiece() {
        System.out.println("getPiece");
        Color color = Color.WHITE;
        Type type = Type.PAWN;
        String position = "c3";
        Piece expResult = new Pawn();
        expResult.setColor(Color.WHITE);
        expResult.setPosition(new Position("c3"));
        Piece result = PieceFactory.getPiece(color, type, position);
        assertEquals(expResult, result);
        
    }
    
}
