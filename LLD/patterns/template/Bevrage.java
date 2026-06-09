package patterns.template;

public abstract class Bevrage {

    // template method
    public final void makeDrink() {
        boilWater();
        addMainIngredient();
        pourInCup();
        serve();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void serve() {
        System.out.println("Serving drink");
    }
    // Different step
    abstract void addMainIngredient();

}
