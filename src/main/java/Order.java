import java.util.List;
public class Order {
    private long number;
    private List<Product> products;
    public Order(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }
}