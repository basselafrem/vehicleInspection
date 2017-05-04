
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
        System.out.println("open");
        Garage instance = new Garage();
        instance.open();
        
    }

    /**
     * Test of close method, of class Garage.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Garage instance = new Garage();
        instance.close();
        
    }

    /**
     * Test of showNextQueueNumber method, of class Garage.
     */
    @Test
    public void testShowNextQueueNumber() {
        System.out.println("showNextQueueNumber");
        Garage instance = new Garage();
        instance.showNextQueueNumber();
       
    }
    
}
