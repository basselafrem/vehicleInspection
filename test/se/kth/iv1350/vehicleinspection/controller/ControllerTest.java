/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.vehicleinspection.controller;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.vehicleinspection.integration.DatabaseManager;
import se.kth.iv1350.vehicleinspection.integration.InspectionItem;

/**
 *
 * @author Bassel
 */
public class ControllerTest {
    private DatabaseManager dbMgr = new DatabaseManager();
    private Controller instance = new Controller(dbMgr);
    
    public ControllerTest() {
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
     * Test of startNewInspection method, of class Controller.
     */
    @Test
    public void testStartNewInspection() {
        instance = new Controller(dbMgr);
        instance.startNewInspection();
        
    }

    /**
     * Test of payByCard method, of class Controller.
     */
    @Test
    public void testPayByCard() {
        
        int cost = 60;
        
        instance.payByCard(cost);
        
    }

    /**
     * Test of getCost method, of class Controller.
     */
    @Test
    public void testGetCost() {
       
        String regNo = "ABC123";
        instance = new Controller(dbMgr);
        int expResult = 60;
        int result = instance.getCost(regNo);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of payByCash method, of class Controller.
     */
    @Test
    public void testPayByCash() {
        
        int paidAmount = 100;
        int cost = 60;
        instance = new Controller(dbMgr);
        int expResult = 40;
        int result = instance.payByCash(paidAmount, cost);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of printReceipt method, of class Controller.
     */
    @Test
    public void testPrintReceipt() {
        
        instance = new Controller(dbMgr);
        instance.printReceipt();
       
    }

    /**
     * Test of cashReceipt method, of class Controller.
     */
    @Test
    public void testCashReceipt() {
        
        instance = new Controller(dbMgr);
        instance.cashReceipt();
        
    }

   
    

    /**
     * Test of printNameAndResult method, of class Controller.
     */
    @Test
    public void testPrintNameAndResult() {
        
        String regNo = "ABC123";
        instance = new Controller(dbMgr);
        instance.printNameAndResult(regNo);
        
    }
    
}
