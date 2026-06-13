package LLD.patterns.builder;

public class HouseBuilder implements Builder {

    private House house = new House();

    @Override
    public void buildFoundation(String foundation) {
        house.setFoundation(foundation);
    }

    @Override
    public void buildWalls(String walls) {
        house.setWalls(walls);
    }

    @Override
    public House getHouse() {
        return house;
    }

}
