package Controller;

import Model.Vehicle;

import java.util.ArrayList;

public class Lender {

    public ArrayList<String> showAllVehicles(ArrayList<Vehicle> listOfVehicles) {
        ArrayList<String> vehicleSpecsList = new ArrayList<String>();

        for (int x = 0; x < listOfVehicles.size(); x++) {
            vehicleSpecsList.add(x, listOfVehicles.get(x).toString());
        }

        return vehicleSpecsList;
    }

    public void addVehicle(ArrayList<Vehicle> listOfVehicles, String name, String model, int dateOfProduction,
                           int vehicleMileage, String type, int fuelAmount, boolean isLend, String whereIsPaked) {

        listOfVehicles.add(new Vehicle(name, model, dateOfProduction, vehicleMileage, type, fuelAmount,
                isLend, whereIsPaked));
    }

    public void deleteVehicle(String name, ArrayList<Vehicle> listOfVehicles) {
        for (int x = 0; x < listOfVehicles.size(); x++) {
            if (name.equals(listOfVehicles.get(x).getName())){
                listOfVehicles.remove(x);
                break;
            }
        }
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
