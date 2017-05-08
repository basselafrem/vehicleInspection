
package se.kth.iv1350.vehicleinspection.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.vehicleinspection.integration.DatabaseManager;

/**
 *
 * @author Bassel
 */
public class InspectionTest {
    
    public InspectionTest() {
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
     * Test of getCost method, of class Inspection.
     */
    @Test
    public void testGetCost() {
        DatabaseManager dbMgr = new DatabaseManager();
        Vehicle vehicle = new Vehicle("ABC123");
       
        Inspection instance = new Inspection(vehicle, dbMgr);
        int expResult = 60;
        int result = instance.getCost();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of printNameAndResult method, of class Inspection.
     */
    @Test
    public void testPrintNameAndResult() {
        DatabaseManager dbMgr = new DatabaseManager();
        Vehicle vehicle = new Vehicle("ABC123");
        
        Inspection instance = new Inspection(vehicle,dbMgr);
        instance.printNameAndResult();
        
    }
    
}
