package Controller;

import Model.Data;
import Model.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LenderTest {

    @Test
    public void showAllVehicles() {
    }

    @Test
    public void addVehicle() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        int lengthOfArrayExpected = 21;
        Vehicle vehicle = new Vehicle("hehe", "x-wing", 0, 0, "walking", 100, false, "back");
        Lender lender = new Lender();
        lender.addVehicle("hehe", "x-wing", 0, 0, "walking", 100, false, "back");

        Assert.assertEquals(lengthOfArrayExpected, testArray.size());
        Assert.assertEquals(vehicle, testArray.get(testArray.size() - 1));

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