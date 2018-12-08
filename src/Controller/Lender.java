package Controller;

import Model.Vehicle;

import java.util.ArrayList;

public class Lender {

    public ArrayList<String> showAllVehicles( ArrayList<Vehicle> listOfVehicles) {
        ArrayList<String> vehicleSpecsList = new ArrayList<String>();

        for (int x=0; x < listOfVehicles.size(); x++){
            vehicleSpecsList.add(x, listOfVehicles.get(x).toString());
        }

        return vehicleSpecsList;
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
