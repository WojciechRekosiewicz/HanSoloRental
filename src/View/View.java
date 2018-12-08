package View;

import Controller.Lender;
import Model.Data;

import java.util.Scanner;

public class View {
    Data data = new Data();
    Lender lender = new Lender();

    public void Menu(){
        int choose;
        System.out.println("Choose what do you wanna do");
        System.out.println("1 to lend");
        System.out.println("2 to buy");
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                subMenuLender();
                break;
            case 2:
                subMenuVehicleDealer();
                break;
        }

    }
    public void subMenuLender(){
        int choose;
        System.out.println("Lend options");
        System.out.println("1 to show all vehicle aval");
        System.out.println("7 to go back to menu");
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("Available");
                allAvailable();
                break;
            case 2:

            case 7:
                Menu();
                break;
        }

    }
    public void subMenuVehicleDealer(){
        System.out.println("Dealer options");

    }

    public void allAvailable(){
        for (int x=0; x < lender.showAllVehicles(data.getAllVehicles()).size(); x++) {
            if (!data.getAllVehicles().get(x).getVehicleRented()) {
                System.out.println(lender.showAllVehicles(data.getAllVehicles()).get(x));
            }
        }
    }
}
