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
public class PrinterTest {
    
    public PrinterTest() {
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
     * Test of printResult method, of class Printer.
     */
    @Test
    public void testPrintResult() {
        
        boolean result_2 = true;
        Printer instance = new Printer();
        instance.printResult(result_2);
        
    }

    /**
     * Test of printReceipt method, of class Printer.
     */
    @Test
    public void testPrintReceipt() {
        
        int amount = 60;
        Printer instance = new Printer();
        instance.printReceipt(amount);
       
    }

    /**
     * Test of cashReceipt method, of class Printer.
     */
    @Test
    public void testCashReceipt() {
        
        int amount = 60;
        Printer instance = new Printer();
        instance.cashReceipt(amount);
        
    }
    
}
