package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Category implements CatalogComponent {

    private String name;

    private List<CatalogComponent> components = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addComponent(CatalogComponent component) {
        components.add(component);
    }

    @Override
    public Double showDetails() {
        System.out.println(" Name: " + name);
        Double sum = 0.0;
        Double totalPrice = 0.0;
        for (CatalogComponent component : components) {
            sum+=component.showDetails();
            // if (component instanceof Product) {
            //     Product product = (Product) component;
            //     sum += product.getPrice();
            // }
        }
        System.out.println(name + "'s Total Price : " + sum);
        totalPrice += sum;
        return totalPrice;
    }

}
