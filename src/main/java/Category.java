public class Category {
    private String name = "Category " + (1+(int)(Math.random()*3));
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}