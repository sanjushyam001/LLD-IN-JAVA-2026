package LLD.patterns.builder;

public class Enginner {

    private Builder builder;

    public Enginner(Builder builder) {
        this.builder = builder;
    }

    public House constructHouse(String foundation, String walls) {
        builder.buildFoundation(foundation);
        builder.buildWalls(walls);
        return builder.getHouse();
    }

}
