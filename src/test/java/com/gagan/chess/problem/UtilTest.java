/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess.problem;

import com.gagan.chess.problem.Util;
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
public class UtilTest {
    
    public UtilTest() {
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
     * Test of getPrintableSet method, of class Util.
     */
    @Test
    public void testGetPrintableSet() {
        System.out.println("getPrintableSet");
        Set<Position> positions = new TreeSet<>();
        positions.add(new Position("a1"));
        positions.add(new Position("c3"));
        String expResult = "[a1, c3, ]";
        String result = Util.getPrintableSet(positions);
        assertEquals(expResult, result);
        
    }
    
}
