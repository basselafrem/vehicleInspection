
package se.kth.iv1350.vehicleinspection.integration;

import se.kth.iv1350.vehicleinspection.model.Card;

/**
 * Represent the external payment authorization
 * @author Bassel
 */

public class PaymentAuthorization {
    private int cost;
   
    /**
     * Confirms the payment
     * @param card the card the will pay with
     * @return true if the payment authorized.
     */
    public boolean authRequest(Card card){
        
        return true;
    }  
}
