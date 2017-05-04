
package se.kth.iv1350.vehicleinspection.integration;

/**
 *Represents the display screen hypothetically hanged on the garage door
 * 
 */
public class Display {
    int number;
    /**
     * Showing the next number in the queue
     * @param number next number
     */
    public void display(int number){
        System.out.println("Next number : " + number);
    }
    
}
