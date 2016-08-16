/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem;

import com.gagan.chess.problem.ChessBoard;
import com.gagan.chess.problem.Piece;
import com.gagan.chess.problem.factories.PieceFactory;
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
public class ChessBoardTest {
    
    public ChessBoardTest() {
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
     * Test of add method, of class ChessBoard.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        Piece piece = PieceFactory.getPiece("W", "B", "f8");
        ChessBoard instance = new ChessBoard();
        instance.add(piece);
        
    }

    /**
     * Test of getPieces method, of class ChessBoard.
     */
    @org.junit.Test
    public void testGetPieces() {
        System.out.println("getPieces");
        ChessBoard instance = new ChessBoard();
        Piece[][] expResult = new Piece[8][8];
        Piece[][] result = instance.getPieces();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of getPiece method, of class ChessBoard.
     */
    @org.junit.Test
    public void testGetPiece_int_int() {
        System.out.println("getPiece");
        int row = 0;
        int column = 0;
        ChessBoard instance = new ChessBoard();
        Piece expResult = null;
        Piece result = instance.getPiece(row, column);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPiece method, of class ChessBoard.
     */
    @org.junit.Test
    public void testGetPiece_Position() {
        System.out.println("getPiece");
        Position pos = new Position("f4");
        ChessBoard instance = new ChessBoard();
        Piece expResult = null;
        Piece result = instance.getPiece(pos);
        assertEquals(expResult, result);
        
    }
    
}
