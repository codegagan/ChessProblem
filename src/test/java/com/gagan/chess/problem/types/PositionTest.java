/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem.types;

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
public class PositionTest {
    
    public PositionTest() {
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
     * Test of hasValidRowIndex method, of class Position.
     */
    @Test
    public void testHasValidRowIndex() {
        System.out.println("hasValidRowIndex");
        Position instance = new Position("c2");
        boolean expResult = true;
        boolean result = instance.hasValidRowIndex();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hasValidColumnIndex method, of class Position.
     */
    @Test
    public void testHasValidColumnIndex() {
        System.out.println("hasValidColumnIndex");
        Position instance = new Position("c2");
        boolean expResult = true;
        boolean result = instance.hasValidColumnIndex();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hasValidFile method, of class Position.
     */
    @Test
    public void testHasValidFile() {
        System.out.println("hasValidFile");
        Position instance = new Position("c2");
        boolean expResult = true;
        boolean result = instance.hasValidFile();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hasValidRank method, of class Position.
     */
    @Test
    public void testHasValidRank() {
        System.out.println("hasValidRank");
        Position instance = new Position("c2");
        boolean expResult = true;
        boolean result = instance.hasValidRank();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isValid method, of class Position.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Position instance = new Position("c2");
        boolean expResult = true;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRowIndex method, of class Position.
     */
    @Test
    public void testGetRowIndex() {
        System.out.println("getRowIndex");
        Position instance =new Position("c2");
        int expResult = 6;
        int result = instance.getRowIndex();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getColumnIndex method, of class Position.
     */
    @Test
    public void testGetColumnIndex() {
        System.out.println("getColumnIndex");
        Position instance = new Position("c2");
        int expResult = 2;
        int result = instance.getColumnIndex();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFile method, of class Position.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        Position instance = new Position("c2");
        char expResult = 'c';
        char result = instance.getFile();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRank method, of class Position.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Position instance = new Position("c2");
        int expResult = 2;
        int result = instance.getRank();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNotation method, of class Position.
     */
    @Test
    public void testGetNotation() {
        System.out.println("getNotation");
        Position instance = new Position("c2");
        String expResult = "c2";
        String result = instance.getNotation();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Position.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = new Position("c2");
        Position instance = new Position("c2");
        boolean expResult = true;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of hashCode method, of class Position.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Position instance = new Position("c2");
        int expResult = "c2".hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of compareTo method, of class Position.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Position o = new Position("c2");
        Position instance = new Position("c1");
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of downRow method, of class Position.
     */
    @Test
    public void testDownRow() {
        System.out.println("downRow");
        Position instance = new Position("c2");
        Position expResult = new Position("c1");
        Position result = instance.downRow();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of upRow method, of class Position.
     */
    @Test
    public void testUpRow() {
        System.out.println("upRow");
        Position instance = new Position("c2");
        Position expResult = new Position("c3");
        Position result = instance.upRow();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of rightColumn method, of class Position.
     */
    @Test
    public void testRightColumn() {
        System.out.println("rightColumn");
        Position instance = new Position("c2");
        Position expResult = new Position("d2");
        Position result = instance.rightColumn();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of leftColumn method, of class Position.
     */
    @Test
    public void testLeftColumn() {
        System.out.println("leftColumn");
        Position instance = new Position("c2");
        Position expResult = new Position("b2");
        Position result = instance.leftColumn();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Position.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Position instance = new Position("c2");
        String expResult = "c2";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
