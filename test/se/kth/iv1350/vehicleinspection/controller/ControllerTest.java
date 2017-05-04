
package se.kth.iv1350.vehicleinspection.controller;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.vehicleinspection.integration.*;

/**
 *
 * @author Bassel
 */
public class ControllerTest {
    private DatabaseManager dbMgr = new DatabaseManager();
    
    
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
        System.out.println("startNewInspection");
        Controller instance = new Controller(dbMgr);
        instance.startNewInspection();
        
    }


    /**
     * Test of getCost method, of class Controller.
     */
    @Test
    public void testGetCost() {
       DatabaseManager dbMgr =new DatabaseManager();
        System.out.println("getCost");
        String regNo = "ABC123";
        Controller instance = new Controller(dbMgr);
        int expResult = 60;
        int result = instance.getCost(regNo);
        assertEquals("The result is ",expResult, result);
        
    }

    /**
     * Test of payByCash method, of class Controller.
     */
    @Test
    public void testPayByCash() {
        System.out.println("payByCash");
        int paidAmount = 100;
        int cost = 60;
        Controller instance = new Controller (dbMgr);
        instance.payByCash(paidAmount, cost);
       
    }

    /**
     * Test of printReceipt method, of class Controller.
     */
    @Test
    public void testPrintReceipt() {
        System.out.println("printReceipt");
        Controller instance = new Controller(dbMgr);
        instance.printReceipt();
        
    }

    /**
     * Test of cashReceipt method, of class Controller.
     */
    @Test
    public void testCashReceipt() {
        System.out.println("cashReceipt");
        Controller instance = new Controller(dbMgr);
        instance.cashReceipt();
    }

    /**
     * Test of findInspectionsByVehicle method, of class Controller.
     */
    @Test
    public void testFindInspectionsByVehicle() {
        System.out.println("findInspectionsByVehicle");
        String regNo = "ABC123";
        Controller instance = new Controller (dbMgr);
        List<InspectionItem> expResult = null;
        List<InspectionItem> result = instance.findInspectionsByVehicle(regNo);
        assertEquals("The result is ",expResult, result);
    }

    /**
     * Test of printNameAndResult method, of class Controller.
     */
    @Test
    public void testPrintNameAndResult() {
        System.out.println("printNameAndResult");
        String regNo = "ABC123";
        Controller instance = new Controller(dbMgr);
        instance.printNameAndResult(regNo);
    }

    /**
     * Test of welcomeBack method, of class Controller.
     */
    @Test
    public void testWelcomeBack() {
        System.out.println("welcomeBack");
        Controller instance = new Controller(dbMgr);
        instance.welcomeBack();
       
    }
    
}
