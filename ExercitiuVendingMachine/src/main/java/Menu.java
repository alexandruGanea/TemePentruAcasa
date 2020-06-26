import java.io.IOException;
import java.util.Map;


public class Menu {

    public Menu() throws IOException {
    }

    ProductFactory productFactory = new ProductFactory();
    FileInput fileInput = new FileInput();
    VendingMachine vendingMachine = VendingMachine.getInstance();

    public Map<Product, Integer> getDrinkMap() {
        return drinkMap;
    }

    public Map<Product, Integer> getCoffeeMap() {
        return coffeeMap;
    }

    public Map<Product, Integer> getSnackMap() {
        return snackMap;
    }

    private final Map<Product, Integer> drinkMap = fileInput.readFile(fileInput.getDrinksFilePath());
    private final Map<Product, Integer> coffeeMap = fileInput.readFile(fileInput.getCoffeeFilePath());
    private final Map<Product, Integer> snackMap = fileInput.readFile(fileInput.getSnacksFilePath());

    public void showMenu() {
        System.out.println("\nCe pofta simti azi? ");
        System.out.println("  --1-- Parca as bea ceva!");
        System.out.println("  --2-- Am nevoie de energie!");
        System.out.println("  --3-- Parca as rontai ceva!");
    }

    public void showMenuCancel() {
        System.out.println("  --0-- CANCEL");
    }

    public void showSubmenuDrinks() {
        System.out.println("Iata ce bauturi avem pentru tine:");
        for (Product product : drinkMap.keySet()) {
            System.out.println("  --" + drinkMap.get(product) +
                    "-- " + product.getProductName() + " - " + product.getProductPrice() + " RON");
        }
    }

    public void showSubmenuCoffee() {
        System.out.println("Iata ce cafele avem pentru tine:");
        for (Product product : coffeeMap.keySet()) {
            System.out.println("  --" + coffeeMap.get(product) +
                    "-- " + product.getProductName() + " - " + product.getProductPrice() + " RON");
        }
    }

    public void showSubmenuSnacks() {
        System.out.println("Iata ce snacksuri avem pentru tine:");
        for (Product product : snackMap.keySet()) {
            System.out.println("  --" + snackMap.get(product).toString() +
                    "-- " + product.getProductName() + " - " + product.getProductPrice() + " RON");
        }
    }

    public void chooseOption(int option, Map<Product, Integer> productMap) throws NotEnoughMoneyException, NotEnoughQuantityException {
        for (Product product : productMap.keySet()) {
            if (option == productMap.get(product)) {
                if (vendingMachine.getUserFunds() < product.getProductPrice()) {
                    throw new NotEnoughMoneyException("Fonduri insuficiente");
                } else if (product.getProductQuantity() == 0) {
                    throw new NotEnoughQuantityException("Stoc insuficient.");
                } else {
                    productFactory.getProduct(product.getProductName());
                    System.out.println(product.toString());
                    vendingMachine.setUserFunds(vendingMachine.getUserFunds() - product.getProductPrice());
                    product.setProductQuantity(product.getProductQuantity() - 1);
                    System.out.println("Multumim pentru tranzactie");
                            if(vendingMachine.getUserFunds()>0){
                                System.out.println("Restul Dvs: " + vendingMachine.getUserFunds());
                            }
                }
            }
        }
    }
}



