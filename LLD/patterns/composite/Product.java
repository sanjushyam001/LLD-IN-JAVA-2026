package patterns.composite;

public class Product implements CatalogComponent {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public Double showDetails() {

        System.out.println("   Product Name: " + name + " Price " + price);
        return price;
    }

}
