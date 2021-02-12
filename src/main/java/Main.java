import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        CSVReader.importFromCSV().stream()
                .collect(Collectors.groupingBy(p -> p.getCategory().getName(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println("Category: " + entry.getKey() + ", total: " + entry.getValue()));
    }
}
