package LLD.patterns.builder;

public interface Builder {

    public void buildFoundation(String foundation);

    public void buildWalls(String walls);

    public House getHouse();
}
