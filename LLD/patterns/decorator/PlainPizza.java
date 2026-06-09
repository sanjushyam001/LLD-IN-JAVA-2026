package patterns.decorator;

class PlainPizza implements Pizza {
    public String getDescription() {
        return "Plain Pizza";
    }

    public int getCost() {
        return 100;
    }
}