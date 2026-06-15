package LLD.flyweight;

public class Main {

    public static void main(String[] args) {
        Tree tree1 = TreeFactory.getTree("oak");
        tree1.display(10, 20);
        Tree tree2 = TreeFactory.getTree("oak");
        tree2.display(40, 50);

        if (tree1 == tree2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
