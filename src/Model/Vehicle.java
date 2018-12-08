package Model;

public class Vehicle {

    private String name;

    private String model;
    private int dateOfProduction;
    private int vehicleMileage;
    private String type;
    private int fuelAmount;
    private Boolean isVehicleRented;
    private String whereIsParked;



    public Vehicle(String name, String model, int dateOfProduction, int vehicleMileage, String type, int fuelAmount, Boolean isVehicleRented, String whereIsParked) {
        this.name = name;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.vehicleMileage = vehicleMileage;
        this.type = type;
        this.fuelAmount = fuelAmount;
        this.isVehicleRented = isVehicleRented;
        this.whereIsParked = whereIsParked;
    }

//Transporter, mysliwiec, walking, driving

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(int vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Boolean getVehicleRented() {
        return isVehicleRented;
    }

    public void setVehicleRented(Boolean vehicleRented) {
        isVehicleRented = vehicleRented;
    }

    public String getWhereIsParked() {
        return whereIsParked;
    }

    public void setWhereIsParked(String whereIsParked) {
        this.whereIsParked = whereIsParked;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", vehicleMileage=" + vehicleMileage +
                ", type='" + type + '\'' +
                ", fuelAmount=" + fuelAmount +
                ", isVehicleRented=" + isVehicleRented +
                ", whereIsParked='" + whereIsParked + '\'' +
                '}';
    }









}
