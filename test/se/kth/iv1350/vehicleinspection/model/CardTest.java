
package se.kth.iv1350.vehicleinspection.model;

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
public class CardTest {
    
    public CardTest() {
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
     * Test of getHolder method, of class Card.
     */
    @Test
    public void testGetHolder() {
        
        Card instance = new Card("Bassel", 3,"1234","12\3");
        String expResult = "Bassel";
        String result = instance.getHolder();
        assertEquals(expResult, result);
    } 

    /**
     * Test of getCVC method, of class Card.
     */
    @Test
    public void testGetCVC() {
        
        Card instance = new Card("Bassel", 3,"1234","12\3");
        int expResult = 3;
        int result = instance.getCVC();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNumber method, of class Card.
     */
    @Test
    public void testGetNumber() {
        
        Card instance = new Card("Bassel", 3,"1234","12\3");
        String expResult = "1234";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getexpiryDate method, of class Card.
     */
    @Test
    public void testGetexpiryDate() {
        
        Card instance = new Card("Bassel", 3,"1234","12\3");
        String expResult = "12\3";
        String result = instance.getexpiryDate();
        assertEquals(expResult, result);
        
    }
    
}
