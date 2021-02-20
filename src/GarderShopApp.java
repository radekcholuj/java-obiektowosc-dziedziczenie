import java.util.Scanner;
import java.util.concurrent.Flow;

public class GarderShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        GardenShop gardenShop = new GardenShop();
        String name;
        double price;
        do {
            System.out.println("-------- Garder Shop ----------");
            System.out.println("1 - add flower");
            System.out.println("2 - add fertilizer");
            System.out.println("3 - display all");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (option) {
                case 1:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n

                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Flower flower = new Flower(name, price, type);
                    gardenShop.addFlower(flower);

                    break;
                case 2:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // \n

                    System.out.println("Purpose: ");
                    String purpose = scanner.nextLine();
                    Fertilizer fertilizer = new Fertilizer(name, price, purpose);
                    gardenShop.addFertilizer(fertilizer);

                    break;
                case 3:
                    gardenShop.displayAll();
                    break;
            }

        }while(option != 0);


        scanner.close();
    }
}
