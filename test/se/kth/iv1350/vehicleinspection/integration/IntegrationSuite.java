
package se.kth.iv1350.vehicleinspection.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Bassel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({se.kth.iv1350.vehicleinspection.integration.PaymentAuthorizationTest.class, se.kth.iv1350.vehicleinspection.integration.GarageTest.class, se.kth.iv1350.vehicleinspection.integration.GarageDoorTest.class, se.kth.iv1350.vehicleinspection.integration.InspectionItemTest.class, se.kth.iv1350.vehicleinspection.integration.PrinterTest.class, se.kth.iv1350.vehicleinspection.integration.DisplayTest.class, se.kth.iv1350.vehicleinspection.integration.DatabaseManagerTest.class})
public class IntegrationSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
