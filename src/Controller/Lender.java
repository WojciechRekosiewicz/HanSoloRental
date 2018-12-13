package Controller;

import Model.Vehicle;

import java.util.ArrayList;

public class Lender {

    public ArrayList<String> showAllVehicles(ArrayList<Vehicle> listOfVehicles) {
        ArrayList<String> vehicleSpecsList = new ArrayList<String>();

        for (int x = 0; x < listOfVehicles.size(); x++) {
            if (!listOfVehicles.get(x).getVehicleRented())
            vehicleSpecsList.add(x, listOfVehicles.get(x).toString());
        }

        return vehicleSpecsList;
    }

    public void addVehicle(ArrayList<Vehicle> listOfVehicles, String name, String model, int dateOfProduction,
                           int vehicleMileage, String type, int fuelAmount, boolean isLend, String whereIsParked) {

        listOfVehicles.add(new Vehicle(name, model, dateOfProduction, vehicleMileage, type, fuelAmount,
                isLend, whereIsParked));
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
        String vehicleSpecs;
        for (Vehicle listOfVehicle : listOfVehicles) {
            if (name.equals(listOfVehicle.getName())) {
                vehicleSpecs = listOfVehicle.toString();
                return vehicleSpecs;
            }
        }
        vehicleSpecs = "no result found";

        return vehicleSpecs;

    }

    public String lendVehicle(String name,  ArrayList<Vehicle> listOfVehicles) {
        boolean rent = true;
        String message = "Vehicle with name " + name + " rented";
//        try {
            for (Vehicle listOfVehicle : listOfVehicles) {
                if (name.equals(listOfVehicle.getName())) {
                    listOfVehicle.setVehicleRented(rent);
                    return message;
                }
            }
            message = "Vehicle with name " + name + " not found";
//        } catch (Exception e){
//            System.out.println("wrong");
//        }


        return message;
    }

    public String returnVehicle(String name,  ArrayList<Vehicle> listOfVehicles) {
        boolean returnVehilce = false;
        String message = "Vehicle with name " + name + " returned";
        for (Vehicle listOfVehicle : listOfVehicles) {
            if (name.equals(listOfVehicle.getName())) {
                listOfVehicle.setVehicleRented(returnVehilce);
                return message;
            }
        }
        message = "Vehicle with name " + name + " not found";

        return message;
    }
}
