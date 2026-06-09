package patterns.decorator;

class CheesePizza implements Pizza {

    private Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public int getCost() {
        return pizza.getCost() + 20;
    }
}