package Model;


import java.util.ArrayList;

public class Data {

    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        for (int x = 0; x < 20; x++){
            vehicles.add(x, new Vehicle("hehe", "x-wing", 0, 0, "walking", 100, false, "back"));
        }
        return vehicles;
    }
}
