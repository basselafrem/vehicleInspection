
package se.kth.iv1350.vehicleinspection.startup;
import se.kth.iv1350.vehicleinspection.controller.Controller;
import se.kth.iv1350.vehicleinspection.integration.DatabaseManager;
import se.kth.iv1350.vehicleinspection.integration.Garage;
import se.kth.iv1350.vehicleinspection.integration.Printer;
import se.kth.iv1350.vehicleinspection.view.View;

public class main {
    public static void main (String[] args){
        DatabaseManager dbMgr = new DatabaseManager();
        Controller contr = new Controller(dbMgr);
        Printer printer = new Printer();
        Garage garage = new Garage();        
        
        View view = new View(contr);
        view.sampleExcution();
    }
}
