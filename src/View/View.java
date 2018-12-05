package View;

import java.util.Scanner;

public class View {
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
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("aval");
                break;
            case 2:
                Menu();
                break;
        }

    }
    public void subMenuVehicleDealer(){
        System.out.println("Dealer options");

    }
}
