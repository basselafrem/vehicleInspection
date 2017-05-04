
package se.kth.iv1350.vehicleinspection.controller;

import se.kth.iv1350.vehicleinspection.model.Vehicle;
import se.kth.iv1350.vehicleinspection.model.Card;
import se.kth.iv1350.vehicleinspection.integration.DatabaseManager;
import se.kth.iv1350.vehicleinspection.integration.PaymentAuthorization;
import java.util.*;
import se.kth.iv1350.vehicleinspection.integration.Garage;
import se.kth.iv1350.vehicleinspection.integration.InspectionItem;
import se.kth.iv1350.vehicleinspection.integration.Printer;
import se.kth.iv1350.vehicleinspection.model.Inspection;



public class Controller {
    private DatabaseManager dbMgr;
    private  InspectionItem item;
    
    private Card card;
   
  
    /**
     * Creates a new instance using the specified database manager.
     *
     * @param dbMgr The database manager used for all database calls.
     */
    public Controller(DatabaseManager dbMgr) {
        this.dbMgr = dbMgr;
}
    /**
     * starting new inspection by opening the garage door, showing next number on 
     * the display and closing the garage door
     */
    public void startNewInspection(){
        Garage garage = new Garage();
        garage.open();
        garage.showNextQueueNumber();
        garage.close();  
    }
    /**
     * the operation of paying by card 
     * @param cost the total cost of the inspection
     */
    public void payByCard(int cost){
        PaymentAuthorization payAuth = new PaymentAuthorization();
        
        if(payAuth.authRequest(cost)){
            Scanner in = new Scanner(System.in);
            
            System.out.println("Enter holder name ");
            String holder = in.nextLine();
            
            System.out.println("Enter card number ");
            String number = in.nextLine();
            
            System.out.println("Enter CVC");
            int cvc = in.nextInt();
            
            Scanner expDate = new Scanner(System.in);           
            System.out.println("Enter expiry date ");
            String expiryDate = expDate.nextLine(); 
            System.out.println("Payment done");
         }     
    }
       /**
     * calling getCost in class inspection 
     * 
     * @return the cost of the inspection
     */
    public int getCost(String regNo){
        Vehicle vehicle = new Vehicle(regNo);
        Inspection inspection = new Inspection(vehicle, dbMgr);
        return inspection.getCost();
    }
    
    /**
     * paying cash 
     * @param paidAmount the amount paid by the costumer
     * @param cost the cost of the inspection required
     */
    public void payByCash(int paidAmount, int cost) {
        int change = paidAmount - cost;
        System.out.println("The change is : " + change);
    } 
   
    /**
     * calling the print receipt in class Printer
     */
    public void printReceipt(){
        Printer printer = new Printer();
        printer.printReceipt(100);
    } 
    /** printing the receipt when paying cash
     * 
     */
    public void cashReceipt(){
        Printer printer = new Printer();
        printer.cashReceipt(60);
    }
    
    /**
     * find the inspection required for the vehicle
     * 
     * @param regNo the registration number of the inspected vehicle
     * @return list with items to inspect
     */
    public List<InspectionItem> findInspectionsByVehicle(String regNo){
        return dbMgr.findInspectionsByVehicle(regNo);  
    }
    
    /**
     * printing the name of the inspected part and the result of the inspection pass/fail
     * @param regNo
     */
    public void printNameAndResult(String regNo){
        Vehicle vehicle = new Vehicle(regNo);
        Inspection inspection = new Inspection(vehicle, dbMgr);
        inspection.printNameAndResult();
    }
    /**
     * print the expression welcome back
     */
    public void welcomeBack(){
        dbMgr.welcomeBack();
    }
   
}
