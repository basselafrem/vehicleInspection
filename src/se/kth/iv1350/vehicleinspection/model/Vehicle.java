
package se.kth.iv1350.vehicleinspection.model;

/**
 *
 * the vehicle that is inspected.
 */
public class Vehicle {
    private final String regNo;
    
    /**
     * creates a vehicle with the specified registration number.
     * 
     * @param regNo the registration number of the newly created vehicle.
     */
    public Vehicle(String regNo){
        this.regNo = regNo;
    }
    
}
