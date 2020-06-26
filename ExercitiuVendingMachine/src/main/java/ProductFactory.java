public class ProductFactory {

    public ProductFactory() {
    }

    public void getProduct(String productName) {
        if (productName.equals("Cola")) {
            new Cola();
        }
        if (productName.equals("Fanta")) {
            new Fanta();
        }
        if (productName.equals("Water")) {
            new Water();
        }
        if (productName.equals("Americano")) {
            new Americano();
        }
        if (productName.equals("Cappuccino")) {
            new Cappuccino();
        }
        if (productName.equals("Espresso")) {
            new Espresso();
        }
        if (productName.equals("Croissant")) {
            new Croissant();
        }
        if (productName.equals("ChocolateBar")) {
            new ChocolateBar();
        }
        if (productName.equals("Chips")) {
            new Chips();
        }
    }

    public Product createProduct(String[] readLine) {
        switch (readLine[0].toLowerCase()) {
            case "cola":

                return new Cola(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "fanta":
                return new Fanta(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "water":
                return new Water(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "americano":
                return new Americano (readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "espresso":
                return new Espresso(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "cappuccino":
                return new Cappuccino(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "chips":
                return new Chips(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "croissant":
                return new Croissant(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            case "chocolatebar":
                return new ChocolateBar(readLine[0], Integer.valueOf(readLine[1]), Integer.valueOf(readLine[2]));
            default:
                return null;
        }
    }
}

