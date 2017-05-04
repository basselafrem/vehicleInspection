/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.vehicleinspection.model;

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
@Suite.SuiteClasses({se.kth.iv1350.vehicleinspection.model.ReceiptTest.class, se.kth.iv1350.vehicleinspection.model.CardTest.class, se.kth.iv1350.vehicleinspection.model.InspectionTest.class, se.kth.iv1350.vehicleinspection.model.ResultTest.class, se.kth.iv1350.vehicleinspection.model.VehicleTest.class})
public class ModelSuite {

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
