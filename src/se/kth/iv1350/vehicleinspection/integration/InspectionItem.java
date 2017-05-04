
package se.kth.iv1350.vehicleinspection.integration;

/**
 * Represents an particular control of a vehicle, for example brakes or suspension.
 */
public class InspectionItem {
    private String name;
    private int cost;
    
    /**
     * Creates new instance representing the specified control.
     * 
     * @param name The name of this control.
     * @param cost The cost of this control.
     */
    public InspectionItem(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    /**
     * @return The name of this control.
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @return  the cost of this control
     */
    public int getCost(){
        return cost;
    }
}
