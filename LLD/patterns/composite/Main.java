package patterns.composite;

public class Main {
    public static void main(String[] args) {

        // Mobiles's Products
        Product iPhone = new Product("IPhone", 150000.00);
        Product samsung = new Product("Samsung", 50000.00);

        // Laptops's Products
        Product hp = new Product("HP Laptop", 130000.00);
        Product dell = new Product("Dell Laptop", 120000.00);

        // Accessories's Products
        Product charger = new Product("IPhone Charger", 5000.50);

        Product earburd = new Product("Boat Earburd", 3000.50);

        // Sub-Categories

        Category mobiles = new Category("Mobiles");

        mobiles.addComponent(iPhone);
        mobiles.addComponent(samsung);

        Category laptops = new Category("Laptops");

        laptops.addComponent(hp);
        laptops.addComponent(dell);

        Category accessories = new Category("Accessories");

        accessories.addComponent(charger);
        accessories.addComponent(earburd);

        // Category

        Category electronics = new Category("Electronics");

        electronics.addComponent(mobiles);
        electronics.addComponent(laptops);
        electronics.addComponent(accessories);

        Double totalPrice = electronics.showDetails();
        System.out.println("Total Price: " + totalPrice);
    }
}
