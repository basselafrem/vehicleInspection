/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.vehicleinspection.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bassel
 */
public class InspectionItemTest {
    
    public InspectionItemTest() {
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
     * Test of getName method, of class InspectionItem.
     */
    @Test
    public void testGetName() {
        
        InspectionItem instance =  new InspectionItem("suspention", 30);;
        String expResult = "suspention";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCost method, of class InspectionItem.
     */
    @Test
    public void testGetCost() {
        
        InspectionItem instance =  new InspectionItem("suspention", 30);;
        int expResult = 30;
        int result = instance.getCost();
        assertEquals(expResult, result);
        
    }
    
}
