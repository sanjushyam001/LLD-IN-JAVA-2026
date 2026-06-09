package patterns.decorator1;

public class OlivesPizzaDecorator extends PizzaDecorator {

    public OlivesPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Olives ,";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

}
