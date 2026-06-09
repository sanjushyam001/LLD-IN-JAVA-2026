package patterns.decorator1;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new PlainPizza();

        pizza = new CheesePizzaDecorator(pizza);
        pizza = new OlivesPizzaDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
