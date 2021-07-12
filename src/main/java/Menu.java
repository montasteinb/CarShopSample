import controller.Shop;
import entity.User;
import entity.UserType;

import java.util.Scanner;

public class Menu {

    Shop shop = new Shop();
    Scanner scanner = new Scanner(System.in);

    public void start() {

        System.out.println("Welcome to car shop, enter you user type: \n 1. Buyer \n 2. Owner \n 3. Exit");
        String userChoice = scanner.nextLine();
        User activeUser = createUser(userChoice);

        if (activeUser == null) {
            handleExit();
        }
        shop.setActiveUser(activeUser);

        showUserMenu(activeUser.getUserType());
        userChoice = scanner.nextLine();
        handleMenuChoice(activeUser.getUserType(), userChoice);

    }

    private void handleExit() {
        System.out.println("Enter 1 to exit or 2 to show main menu");
        if (scanner.nextLine().equals("1")) {
            System.exit(0);
        }
        start();
    }

    private User createUser(String userChoice) {
        switch (Integer.parseInt(userChoice)) {
            case 1:
                System.out.println("Enter your budget: ");
                double budget = Double.parseDouble(scanner.nextLine());
                return new User(UserType.BUYER, budget);
            case 2:
                return new User(UserType.OWNER);
            default:
                break;
        }

        return null;
    }

    private void handleMenuChoice(UserType userType, String userChoice) {
        switch (userType){
            case OWNER:
                handleOwnerChoice(userChoice);
                break;
            case BUYER:
                handleBuyerChoice(userChoice);
                break;
            default:
                start();
        }
    }

    private void handleBuyerChoice(String userChoice) {
        switch (userChoice) {
            case "1":
                shop.sellCar();
                break;
            case "2":
                shop.viewCars();
                break;
            case "3":
                handleExit();
                break;
            default:
                break;
        }
        showUserMenu(shop.getActiveUser().getUserType());
    }

    private void handleOwnerChoice(String userChoice) {
        switch (userChoice) {
            case "1":
                shop.addCar();
                break;
            case "2":
                shop.removeCar();
                break;
            case "3":
                shop.viewCars();
                break;
            case "4":
                shop.viewSalesHistory();
                break;
            case "5":
                handleExit();
                break;
            default:
                break;
        }
        showUserMenu(shop.getActiveUser().getUserType());
    }

    private void showUserMenu(UserType userType) {
        switch (userType){
            case OWNER:
                System.out.println(getOwnerMenu());
                break;
            case BUYER:
                System.out.println(getBuyerMenu());
                break;
            default:
                start();
        }
        String userChoice = scanner.nextLine();
        handleMenuChoice(userType, userChoice);
    }

    private String getBuyerMenu() {
        return "\n Choose one option below: "
                + "\n1. Buy car"
                + "\n2. View all cars"
                + "\n3. Exit";

    }

    private String getOwnerMenu() {
        return "\n Choose one option below:"
                + "\n1. Add car"
                + "\n2. Remove car"
                + "\n3. View cars"
                + "\n4. Sales history"
                + "\n5. Exit";

    }
}
