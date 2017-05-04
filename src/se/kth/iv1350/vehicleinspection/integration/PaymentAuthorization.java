
package se.kth.iv1350.vehicleinspection.integration;
/**
 * Represent the external payment authorization
 * @author Bassel
 */

public class PaymentAuthorization {
    private int cost;
   
    /**
     * Confirms the payment
     * @param cost the cost of the inspection
     * @return true if the payment authorized.
     */
    public boolean authRequest(int cost){
        System.out.println("Payment authorization has been confirmed");
        return true;
    }  
}
