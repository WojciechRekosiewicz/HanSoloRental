package Controller;

import Model.Data;
import Model.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LenderTest {

    @Test
    public void showAllVehicles() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        String nameToDisplay = "x-wing";
        String modelToDisplay = "x-wing";
        int dateOfProduction = 1;
        int vehicleMileage = 10;
        String type = "Fighter";
        int fuelAmount = 100;
        boolean isVehicleRented = false;
        String whereIsParked = "Back";

        Lender lender = new Lender();
        lender.showAllVehicles(testArray);

        String expected = "name='" + nameToDisplay + '\'' +
                ", model='" + modelToDisplay + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", vehicleMileage=" + vehicleMileage +
                ", type='" + type + '\'' +
                ", fuelAmount=" + fuelAmount +
                ", isVehicleRented=" + isVehicleRented +
                ", whereIsParked='" + whereIsParked + '\'' +
                '}';


        Assert.assertEquals(expected ,  lender.showAllVehicles(testArray).get(0));

    }

    @Test
    public void addVehicle() {
        Data data = new Data();
        Lender lender = new Lender();
        ArrayList<Vehicle> testArray = data.getAllVehicles();

        int lengthOfArrayExpected = 21;

        Vehicle vehicle = new Vehicle("hehe", "x-wing", 0, 0, "Walking",
                100, false, "back");
        lender.addVehicle(testArray,"hehe", "x-wing", 0, 0, "Walking",
                100, false, "back");

        Assert.assertEquals(lengthOfArrayExpected, testArray.size());
//        Assert.assertSame(vehicle, testArray.get(testArray.size() -1));

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
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        String nameToDisplay = "x-wing";
        String modelToDisplay = "x-wing";
        int dateOfProduction = 1;
        int vehicleMileage = 10;
        String type = "fighter";
        int fuelAmount = 100;
        boolean isVehicleRented = false;
        String whereIsParked = "Back";

        Lender lender = new Lender();
        lender.showVehicleSpecs(nameToDisplay, testArray);

        String expected = "name='" + nameToDisplay + '\'' +
                ", model='" + modelToDisplay + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", vehicleMileage=" + vehicleMileage +
                ", type='" + type + '\'' +
                ", fuelAmount=" + fuelAmount +
                ", isVehicleRented=" + isVehicleRented +
                ", whereIsParked='" + whereIsParked + '\'' +
                '}';


        Assert.assertEquals(expected  , lender.showVehicleSpecs(nameToDisplay, testArray));



    }

    @Test
    public void lendVehicle() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        boolean isVehicleRented = true;
        String name= "x-wing";
        int positionOfXWing = 10;

        Lender lender = new Lender();
        lender.lendVehicle(name, testArray);


        Assert.assertEquals(isVehicleRented, testArray.get(positionOfXWing).getVehicleRented());
    }

    @Test
    public void returnVehicle() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        boolean isVehicleReturned = false;
        String name= "x-wing";
        int positionOfXWing = 10;

        Lender lender = new Lender();
        lender.returnVehicle(name, testArray);


        Assert.assertNotEquals(isVehicleReturned, testArray.get(positionOfXWing).getVehicleRented());
    }
}