package View;

import Controller.Lender;
import Controller.VehicleDealer;
import Model.Data;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    Data data = new Data();
    Lender lender = new Lender();
    VehicleDealer vehicleDealer = new VehicleDealer();
    ArrayList<Vehicle> vehicleArray = data.getAllVehicles();

    public void Menu() {
        int choose;
        System.out.println("Choose what do you wanna do");
        System.out.println("1 to lend");
        System.out.println("2 to buy");
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                subMenuLender();
                break;
            case 2:
                subMenuVehicleDealer();
                break;
        }

    }

    public void subMenuLender() {
        int choose;
        System.out.println("Lend options");
        System.out.println("1 to show all vehicle aval");
        System.out.println("2 to add vehicle");
        System.out.println("7 to go back to menu");
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Available");
                allAvailable();
                Menu();
                break;
            case 2:
                System.out.println();
                System.out.println("choose name etc strings");
                String x = scanner.next();
                System.out.println("choose date etc int");
                int y = scanner.nextInt();
                lender.addVehicle(vehicleArray, x, x, y, y, x, y, false, "Back");
                allAvailable();
                Menu();
                break;
            case 7:
                Menu();
                break;
        }

    }

    public void subMenuVehicleDealer() {
        System.out.println("Dealer options");
        int choose;
        System.out.println("1 to show all vehicles in front");
        System.out.println("2 ");
        System.out.println("7 to go back to menu");
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("All parked in front");
                allAvailable();
                Menu();
                break;
            case 2:
                allInFront();
                Menu();
                break;
            case 7:
                Menu();
                break;
        }

    }

    public void allAvailable() {
        for (int x = 0; x < lender.showAllVehicles(vehicleArray).size(); x++) {

            System.out.println(lender.showAllVehicles(vehicleArray).get(x));

        }
    }

    public void allInFront() {
        ArrayList<String> vehicleInFrontArray = vehicleDealer.showCarsInFront(vehicleArray);
        for (int x = 0; x < vehicleInFrontArray.size(); x++) {
            System.out.println(vehicleInFrontArray.get(x));
        }
    }
}
