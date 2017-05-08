
package se.kth.iv1350.vehicleinspection.integration;

import se.kth.iv1350.vehicleinspection.model.Card;

/**
 * this class prints the receipt and the result of the performed inspection.
 */
public class Printer {
    private Card card;
    public Printer(){}
    
   
    /**
     * prints out the result of the performed inspection
     * @param result the written result of the inspection
     */
    public void printResult(boolean result){
        if(result)
            System.out.println("Pass");
    }
    /**
     * print the receipt after payment confirmation
     * @param amount the amount to pay 
     */
    public void printReceipt(int amount){
        PaymentAuthorization payAuth = new PaymentAuthorization();
        if (payAuth.authRequest(card)){
            System.out.println("Take the receipt");
        }
    }
    /**
     * print the receipt after paying 
     * @param amount the amount to pay
     */
    public void cashReceipt(int amount){
        System.out.println("Take the receipt");
    }
}
