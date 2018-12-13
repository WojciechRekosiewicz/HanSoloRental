package Controller;

import Model.Vehicle;

import java.util.ArrayList;

public class VehicleDealer {
    public ArrayList<String> showCarsInFront(ArrayList<Vehicle> listOfVehicles){
        ArrayList<String> vehicleSpecsList = new ArrayList<String>();

        for (int x = 0; x < listOfVehicles.size(); x++) {
            if ((listOfVehicles.get(x).getWhereIsParked()).equals("Front")){
                vehicleSpecsList.add(listOfVehicles.get(x).toString());
            }
        }

        return vehicleSpecsList;

    }
    public ArrayList<String> showCarsInBack(ArrayList<Vehicle> listOfVehicles){
        ArrayList<String> vehicleSpecsList = new ArrayList<String>();

        for (int x = 0; x < listOfVehicles.size(); x++) {
            if ((listOfVehicles.get(x).getWhereIsParked()).equals("Back"))
                vehicleSpecsList.add(listOfVehicles.get(x).toString());
        }

        return vehicleSpecsList;
    }
}
