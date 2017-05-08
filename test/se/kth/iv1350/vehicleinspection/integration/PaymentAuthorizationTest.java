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
import se.kth.iv1350.vehicleinspection.model.Card;

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
       
        Card card = new Card("bassel",343,"3245 32523","3/3");
        PaymentAuthorization instance = new PaymentAuthorization();
        boolean expResult = true;
        boolean result = instance.authRequest(card);
        assertEquals(expResult, result);
        
    }
    
}
