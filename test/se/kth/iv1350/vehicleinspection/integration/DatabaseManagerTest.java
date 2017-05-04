
package se.kth.iv1350.vehicleinspection.integration;

import java.util.List;
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
public class DatabaseManagerTest {
    
    public DatabaseManagerTest() {
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
     * Test of findInspectionsByVehicle method, of class DatabaseManager.
     */
    @Test
    public void testFindInspectionsByVehicle() {
        System.out.println("findInspectionsByVehicle");
        String regNo = "ABC123";
        DatabaseManager instance = new DatabaseManager();
        List<InspectionItem> expResult = null;
        List<InspectionItem> result = instance.findInspectionsByVehicle(regNo);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of welcomeBack method, of class DatabaseManager.
     */
    @Test
    public void testWelcomeBack() {
        System.out.println("welcomeBack");
        DatabaseManager instance = new DatabaseManager();
        instance.welcomeBack();
        
    }
    
}
