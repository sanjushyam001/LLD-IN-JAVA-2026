package patterns.singleton;

public class Test {
    public static void main(String[] args) {

        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        if (object1 == object2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}
