package Model.ToLend;

public abstract class Vehicle {
    String name;
    String model;
    int dateOfProduction;
    int vehicleMileage;
    String type;
    int fuelAmount;
    String isVehicleLend;

    public abstract String getName();
    public abstract String getModel();
    public abstract int getDateOfProduction();
    public abstract int getVehicleMileage();
    public abstract String getType();
    public abstract int getFuelAmount();
    public abstract String getIsVehicleLend();




}
