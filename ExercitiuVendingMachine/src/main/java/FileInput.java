import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileInput extends CompareTo {
    public FileInput() {
    }

    String drinksFilePath = "D:\\Java Projects\\Files for use in exercises\\ExercitiuVendingMachine\\DrinksFile.txt";
    String coffeeFilePath = "D:\\Java Projects\\Files for use in exercises\\ExercitiuVendingMachine\\CoffeeFile.txt";
    String snacksFilePath = "D:\\Java Projects\\Files for use in exercises\\ExercitiuVendingMachine\\SnacksFile.txt";

    ProductFactory productfactory = new ProductFactory();

    public Map<Product, Integer> readFile(String filepath) throws IOException {
        TreeMap<Product, Integer> productMap = new TreeMap<>(new CompareTo());
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        String readLine = bufferedReader.readLine();
        int counter = 1;
        while (readLine != null && !readLine.isEmpty()) {
            String[] lineArray = readLine.split(";");
            productMap.put(productfactory.createProduct(lineArray), counter);
            readLine = bufferedReader.readLine();
        }
        for(Product product:productMap.keySet()){
            productMap.put(product, counter);
            counter++;
        }
        return productMap;
    }

    public String getDrinksFilePath() {
        return drinksFilePath;
    }

    public String getCoffeeFilePath() {
        return coffeeFilePath;
    }

    public String getSnacksFilePath() {
        return snacksFilePath;
    }
}
