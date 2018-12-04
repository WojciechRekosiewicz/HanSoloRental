package Model;

public class Data {
    Vehicle[] allVehicles = new Vehicle[30];
    public Vehicle[] getAllVehicles() {

        for (int x=0; x < 30; x++ ){
            allVehicles[x] = new Driving();
        }
        return allVehicles;
    }
}
