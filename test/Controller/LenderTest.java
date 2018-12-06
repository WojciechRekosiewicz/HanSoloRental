package Controller;

import Model.Data;
import Model.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LenderTest {

    @Test
    public void showAllVehicles() {
    }

    @Test
    public void addVehicle() {
    }

    @Test
    public void deleteVehicle() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        int lengthOfArrayExpected = 19;
        String nameToDelete = "x-wing";

        Lender lender = new Lender();
        lender.deleteVehicle(nameToDelete, testArray);

        Assert.assertEquals(lengthOfArrayExpected, testArray.size());
    }

    @Test
    public void showVehicleSpecs() {
    }

    @Test
    public void lendVehicle() {
    }

    @Test
    public void returnVehicle() {
    }
}