public class Product {
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    private String name;
    private Integer price;
    private Category category;
    public String getName() {
        return name;
    }
    public Integer getPrice() {
        return price;
    }
    public Category getCategory() {
        return category;
    }
}