package patterns.decorator;

class OlivesPizza implements Pizza {

    private Pizza pizza;

    public OlivesPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public int getCost() {
        return pizza.getCost() + 30;
    }
}
