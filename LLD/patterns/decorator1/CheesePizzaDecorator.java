package patterns.decorator1;

public class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Cheese ,";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

}
