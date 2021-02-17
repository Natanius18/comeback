public class Product {
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private Integer price;
    private Category category = new Category();

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}