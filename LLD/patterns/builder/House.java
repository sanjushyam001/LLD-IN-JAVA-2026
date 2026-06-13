package LLD.patterns.builder;

public class House {

    private String foundation;
    private String walls;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", walls=" + walls + "]";
    }

}
