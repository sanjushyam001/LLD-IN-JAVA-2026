package LLD.flyweight;

public class Oak implements Tree {

    private String color = "green";
    private String type = "oak";

    @Override
    public void display(int x, int y) {
        System.out.println("X: " + x + " Y: " + y);
    }
    

}
