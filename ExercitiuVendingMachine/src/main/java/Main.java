import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        INVENTAR:
        - FISIERE: 3
        - CLASE:
            - VendingMachine - Singleton
            - ProductFactory - FactoryMethod
            - Product - attributes: name, price, quantity
                - Drinks - extends Product
                    - Cola - extends Drinks
                    - Fanta - extends Drinks
                    - Water - extends Drinks
                - Coffee - extends Product
                    - Cappucino - extends Coffee
                    - Americano - extends Coffee
                    - Espresso - extends Coffee
                - Snacks - extends Product
                    - Croissant - extends Snacks
                    - Chips - extends Snacks
                    - ChocolateBar - extends Snacks
            - Exceptii: AmountNotAcceptedException, NotEnoughMoneyException, NotEnoughQuantityException
         */


        try {
            Menu menu = new Menu();
            VendingMachine vendingMachine = VendingMachine.getInstance();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bine ati venit la FOAMETRON 2000!\nVa rugam introduceti bani:\nSuma introdusa: ");
            vendingMachine.setUserFunds(scanner.nextInt());
            if (vendingMachine.getUserFunds() <= 0) {
                throw new AmountNotAcceptedException("Suma introdusa nu poate fi 0 sau mai mica");
            }
            menu.showMenu();
            int menuOption = scanner.nextInt();
            int subMenuOption;
            while (menuOption != 0) {
                if (menuOption == 1) {
                    menu.showSubmenuDrinks();
                    menu.showMenuCancel();
                    subMenuOption = scanner.nextInt();
                    while (subMenuOption != 0) {
                        menu.chooseOption(subMenuOption, menu.getDrinkMap());
                        subMenuOption = 0;
                    }
                    menu.showMenu();
                    menuOption = scanner.nextInt();
                } else if (menuOption == 2) {
                    menu.showSubmenuCoffee();
                    menu.showMenuCancel();
                    subMenuOption = scanner.nextInt();
                    while (subMenuOption != 0) {
                        menu.chooseOption(subMenuOption, menu.getCoffeeMap());
                        subMenuOption = 0;
                    }
                    menu.showMenu();
                    menuOption = scanner.nextInt();
                } else if (menuOption == 3) {
                    menu.showSubmenuSnacks();
                    menu.showMenuCancel();
                    subMenuOption = scanner.nextInt();
                    while (subMenuOption != 0) {
                        menu.chooseOption(subMenuOption, menu.getSnackMap());
                        subMenuOption = 0;
                    }
                    menu.showMenu();
                    menuOption = scanner.nextInt();
                } else {
                    System.out.println("Optiunea aleasa nu exista, va rugam selectati alta optiune: ");
                    menuOption = scanner.nextInt();
                }
            }
        } catch (NotEnoughMoneyException e) {
            System.out.println("Nu aveti suficienti bani " + e.getMessage());
        } catch (NotEnoughQuantityException e) {
            System.out.println("Nu mai este, ia si tu altceva " + e.getMessage());
        } catch (
                AmountNotAcceptedException e) {
            System.out.println(e.getMessage());
        } catch (
                FileNotFoundException e) {
            System.out.println("Fisier negasit " + e.getMessage());
        } catch (
                IOException e) {
            System.out.println("Exceptie IO " + e.getMessage());
        }
    }
}




