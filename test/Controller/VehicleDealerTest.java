package Controller;

import Model.Data;
import Model.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VehicleDealerTest {

    @Test
    public void showCarsInFront() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        String nameToDisplay = "taifighter";
        String modelToDisplay = "taifighter";
        int dateOfProduction = 20;
        int vehicleMileage = 0;
        String type = "Fighter";
        int fuelAmount = 100;
        boolean isVehicleRented = false;
        String whereIsParked = "Front";

        VehicleDealer vehicleDealer = new VehicleDealer();
        ArrayList<String> testArray1 = vehicleDealer.showCarsInFront(testArray);

        String expected = "name='" + nameToDisplay + '\'' +
                ", model='" + modelToDisplay + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", vehicleMileage=" + vehicleMileage +
                ", type='" + type + '\'' +
                ", fuelAmount=" + fuelAmount +
                ", isVehicleRented=" + isVehicleRented +
                ", whereIsParked='" + whereIsParked + '\'' +
                '}';
//        vehicleDealer.showCarsInFront(testArray).get(0)

        Assert.assertEquals(expected , testArray1.get(0));

    }

    @Test
    public void showCarsInBack() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        String name = "x-wing";
        String model = "x-wing";
        int dateOfProduction = 1;
        int vehicleMileage = 10;
        String type = "Fighter";
        int fuelAmount = 100;
        boolean isVehicleRented = false;
        String whereIsParked = "Back";

        VehicleDealer vehicleDealer = new VehicleDealer();

        String expected = "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", vehicleMileage=" + vehicleMileage +
                ", type='" + type + '\'' +
                ", fuelAmount=" + fuelAmount +
                ", isVehicleRented=" + isVehicleRented +
                ", whereIsParked='" + whereIsParked + '\'' +
                '}';

        Assert.assertEquals(expected  , vehicleDealer.showCarsInBack(testArray).get(0));

    }
}