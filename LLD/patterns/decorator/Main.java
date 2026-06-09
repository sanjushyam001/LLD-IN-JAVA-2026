package patterns.decorator;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PlainPizza();

        pizza = new CheesePizza(pizza);
        pizza = new OlivesPizza(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
