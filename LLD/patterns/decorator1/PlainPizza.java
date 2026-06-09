package patterns.decorator1;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza,";
    }

    @Override
    public int getCost() {
        return 50;
    }

}
