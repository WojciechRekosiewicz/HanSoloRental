package Controller;

import Model.Vehicle;

import java.util.ArrayList;

public class Lender {
    public String[] showAllVehicles( ArrayList<Vehicle> listOfVehicles) {

        return null;
    }

    public void addVehicle(String name, String model, int dateOfProduction, int vehicleMileage, String type,
                           int fuelAmount, boolean isLend, String whereIsPaked) {
    }

    public void deleteVehicle(String name,  ArrayList<Vehicle> listOfVehicles) {
    }

    public String showVehicleSpecs(String name, ArrayList<Vehicle> listOfVehicles) {

        return null;

    }

    public boolean lendVehicle(String name,  ArrayList<Vehicle> listOfVehicles) {
        return true;
    }

    public boolean returnVehicle(String name,  ArrayList<Vehicle> listOfVehicles) {
        return false;
    }
}
