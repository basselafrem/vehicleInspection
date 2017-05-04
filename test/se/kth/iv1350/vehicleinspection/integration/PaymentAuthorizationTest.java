
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
public class PaymentAuthorizationTest {
    
    public PaymentAuthorizationTest() {
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
     * Test of authRequest method, of class PaymentAuthorization.
     */
    @Test
    public void testAuthRequest() {
        System.out.println("authRequest");
        int cost = 60;
        PaymentAuthorization instance = new PaymentAuthorization();
        boolean expResult = true;
        boolean result = instance.authRequest(cost);
        assertEquals(expResult, result);
        
    }
    
}
