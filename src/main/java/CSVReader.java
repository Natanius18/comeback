import java.io.*;
import java.util.*;

public class CSVReader {
    public static void importFromCSV() {
        ArrayList<Product> products = new ArrayList<>();
        String csvFile = "C:\\Users\\Натан\\Desktop\\Products.csv";
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                products.add(parseContactLine(line));
            }
            for (Product product : products) {
                System.out.println("Name: " + product.getName());
                System.out.println("Price: " + product.getPrice());
                System.out.println("Category: " + product.getCategory());
                System.out.println("--------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Product parseContactLine(String line) {
        String[] data = line.split(", ");
        return new Product(data[0], Integer.valueOf(data[1]));
    }
}

