
package se.kth.iv1350.vehicleinspection.integration;


public class Garage {
   
    private Display display;
    private GarageDoor garageDoor;
   /**
    * represents the garage
    * 
    */
    public Garage()
    {
        display = new Display();
        garageDoor = new GarageDoor();
    }
    /**
     * open the garage door
     */
    public void open(){
        System.out.println("Door is opened");
    }
    /**
     * close the garage door 
     */
    public void close(){
        System.out.println("Door is closed");
    }
    /**
     * show the next costumer number on the display
     */
    public void showNextQueueNumber(){
        display.display(1);
    }
}