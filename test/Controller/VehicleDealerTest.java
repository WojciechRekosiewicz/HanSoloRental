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
        String name = "x-wing";
        String model = "x-wing";
        int dateOfProduction = 1;
        int vehicleMileage = 10;
        String type = "fighter";
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

        Assert.assertEquals(expected  , vehicleDealer.showCarsInFront(testArray)[0]);

    }

    @Test
    public void showCarsInBack() {
        Data data = new Data();
        ArrayList<Vehicle> testArray = data.getAllVehicles();
        String name = "x-wing";
        String model = "x-wing";
        int dateOfProduction = 1;
        int vehicleMileage = 10;
        String type = "fighter";
        int fuelAmount = 100;
        boolean isVehicleRented = false;
        String whereIsParked = "Front";

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

        Assert.assertEquals(expected  , vehicleDealer.showCarsInFront(testArray)[0]);

    }
}