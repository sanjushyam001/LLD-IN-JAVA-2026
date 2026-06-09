package patterns.decorator1;

abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
