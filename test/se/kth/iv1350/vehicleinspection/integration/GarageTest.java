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
public class GarageTest {
    
    public GarageTest() {
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
     * Test of open method, of class Garage.
     */
    @Test
    public void testOpen() {
        
        Garage instance = new Garage();
        instance.open();
       
    }

    /**
     * Test of close method, of class Garage.
     */
    @Test
    public void testClose() {
        
        Garage instance = new Garage();
        instance.close();
       
    }

    /**
     * Test of showNextQueueNumber method, of class Garage.
     */
    @Test
    public void testShowNextQueueNumber() {
        
        Garage instance = new Garage();
        instance.showNextQueueNumber();
        
    }
    
}
