import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = CSVReader.importFromCSV();
        products.stream()
                .collect(Collectors.groupingBy(p -> p.getCategory().getName(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + ", total: " + entry.getValue()));

        List<Order> ordersByCategories = products.stream()
                .collect(Collectors.groupingBy(p -> p.getCategory().getName(), Collectors.toList()))
                .values()
                .stream()
                .map(Order::new)
                .collect(Collectors.toList());

        ordersByCategories.forEach(orderByCategory -> {
            System.out.println(orderByCategory.getProducts());
            System.out.println("_______");
        });
    }
}
