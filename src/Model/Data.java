package Model;


import java.util.ArrayList;

public class Data {

    private String[] name = {"1", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",};
    private String[] model = {"1", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",};
    private int[] dateOfProduction ={10, 20, 1, 30, 1000, 2000, 3000, 54000000, 3, 5, 324, 12, 32, 6543, 243,
            123, 123, 213, 5, 77 };
    private int[] vehicleMillage = {2220,0,0,100000,123213, 213213, 423432, 32312, 231213, 213123, 43, 2, 213,
            231, 21, 657657, 23234, 342423, 432 ,324234};
    private String[] type = {"Walking", "Walking", "Walking", "Walking", "Walking",
            "Driving", "Driving", "Driving", "Driving", "Driving", "Fighter", "Fighter", "Fighter", "Fighter",
            "Fighter", "Transporter", "Transporter", "Transporter", "Transporter", "Transporter",};
    private int fuelAmount = 100;
    private boolean isVehicleRented = false;
    private String[] whereIsParked = {"Back", "Back", "Back", "Back", "Back", "Front", "Front",
            "Front", "Front", "Front", "Front", "Front", "Front", "Front", "Front", "Back", "Back",
            "Back", "Back", "Back",};


    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        for (int x = 0; x < 20; x++){
            vehicles.add(x, new Vehicle(name[x], model[x], dateOfProduction[x], vehicleMillage[x],
                    type[x], fuelAmount, isVehicleRented, whereIsParked[x]));
        }
        return vehicles;
    }
}
