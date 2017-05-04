
package se.kth.iv1350.vehicleinspection.model;

import java.util.List;
import se.kth.iv1350.vehicleinspection.integration.DatabaseManager;
import se.kth.iv1350.vehicleinspection.integration.InspectionItem;
import se.kth.iv1350.vehicleinspection.integration.Printer;

/**
 * Represents an inspection of a vehicle.
 */
public class Inspection {
    private Vehicle vehicle ;
    private DatabaseManager dbMgr;
    private List<InspectionItem> inspections; 
    private String regNo;
    

    /**
     * Creates a new instance, representing an inspection of the specified vehicle.
     *
     * @param vehicle The vehicle that is inspected.
     * @param dbMgr
     */
    public Inspection(Vehicle vehicle, DatabaseManager dbMgr) {
        this.vehicle = vehicle;
        this.inspections = dbMgr.findInspectionsByVehicle(regNo);
    }
    /**
     * calculating the cost of the total inspection required
     
     * @return The cost of this inspection.
     */
    public int getCost() {
        int totalCost = 0;
        if (inspections == null) {
            return 0;
        }
        for (InspectionItem inspItem : inspections) {
            totalCost = totalCost + inspItem.getCost();
        }
        return totalCost;
    }
     /**
     * Printing out the names of the required inspected Items
     */
    public void printNameAndResult() {
        Printer printer = new Printer ();
        for (InspectionItem inspItem : inspections) {
            System.out.println("Inspection performed on : " + inspItem.getName()+" is ");
            printer.printResult(true);
        }
    } 
}
