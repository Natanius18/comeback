import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<Product> importFromCSV() {
        ArrayList<Product> products = new ArrayList<>();
        String csvFile = "C:\\Users\\Натан\\Desktop\\Products.csv";
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                products.add(parseContactLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    private static Product parseContactLine(String line) {
        String[] data = line.split(", ");
        return new Product(data[0], Integer.valueOf(data[1]));
    }
}