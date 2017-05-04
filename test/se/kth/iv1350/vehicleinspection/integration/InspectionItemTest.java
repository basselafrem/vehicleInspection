

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
        System.out.println("getName");
        InspectionItem instance = new InspectionItem("suspention", 30);
        String expResult = "suspention";
        String result = instance.getName();
        assertEquals("The result is ",expResult, result);
        
    }

    /**
     * Test of getCost method, of class InspectionItem.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        InspectionItem instance = new InspectionItem("suspention", 30);
        int expResult = 30;
        int result = instance.getCost();
        assertEquals("The result is ",expResult, result);
        
    }
    
}
