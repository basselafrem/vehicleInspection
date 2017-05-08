
package se.kth.iv1350.vehicleinspection.model;


public class Card {
   private  String holder;
   private  int CVC;
   private  String number;
   private  String expiryDate;
   /**
    * creates an credit card instance
    * @param holder the name of the holder
    * @param CVC cvc number of the card
    * @param number number of the card
    * @param expiryDate expiry date of the card
    */
    
    public  Card(String holder, int CVC, String number, String expiryDate){
            
            this.holder = holder;
            this.CVC =CVC;
            this.number = number;
            this.expiryDate = expiryDate;
    }
    /**
     * printing the holder name
     * @return holder name
     */
    public String getHolder(){
        return holder;
    }
    /**
     * printing the CVC number on the back of the card
     * @return cvc number
     */
    public int getCVC(){
        return CVC;
    }
    /**
     * printing the card number (16 number)
     * @return card number
     */
    public String getNumber(){
        return number;
    }
    /**
     * printing the expiry date of the card
     * @return 
     */
    public String getexpiryDate(){
        return expiryDate;
    }
      
}
