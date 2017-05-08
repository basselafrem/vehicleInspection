
package se.kth.iv1350.vehicleinspection.view;

import  se.kth.iv1350.vehicleinspection.controller.Controller;
import java.util.*;
/**
 *
 * This class is a placeholder for the view.
 */
public class View {
  private Controller contr;
  Scanner in = new Scanner(System.in);
  /**
   * creates a specified instance that will use the specified controller for all system operation
   * @param contr  the controller to use in system operation.
   */
  public View(Controller contr){
      this.contr = contr;
  }
  
  /**
   * calls all system operation and print out the result  to.
   */
  public void sampleExcution(){
      // starting new inspection, opening, showing next number on the display and closing garagedoor
      contr.startNewInspection();
      
      // Entring the registration number
      String regNo = "ABC123";
      System.out.println("The registration number is :ABC123");
      
      // calculating the cost of the requierd inspection     
      System.out.println("Calculating the cost of the requierd inspection.....");
      int cost = contr.getCost(regNo);
      System.out.println("The cost of the inspection is : "+ cost);
      
      // chosing how to pay 
      System.out.println("Would you like to pay with (card) or (cash)?");
      String payWay= in.nextLine();
      switch (payWay) {
          case "card":
              {
                  contr.payByCard(cost);
                  // printing the receipt
                  System.out.println("Payment authorization has been confirmed");
                  contr.printReceipt();
                  // finding the inspection
                  contr.findInspectionsByVehicle(regNo);
                  // printing the names of the inspected items
                  contr.printNameAndResult(regNo);
                  //printing welcome back on the screen 
                  System.out.println("Welcome Back") ;
                  break;
              }
          case "cash":
              {
                  // entering paidAmount
                  System.out.println("How much do you want ot pay: ");
                  int paidAmount = in.nextInt();
                  int change = contr.payByCash(paidAmount, cost);
                  System.out.println("The change is : " + change);
                  //printing the receipt
                  contr.cashReceipt();
                  //finding the inspection
                  contr.findInspectionsByVehicle(regNo);
                  //printing the names of the inspected items
                  contr.printNameAndResult(regNo);
                  //print welcome back 
                  System.out.println("Welcome Back") ;
                  break;
              }
          default:
              System.out.println("Please chose paying way : card or cash");
              break; 
      }
  }
}

