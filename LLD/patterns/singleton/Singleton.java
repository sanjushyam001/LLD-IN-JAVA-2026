package patterns.singleton;

public class Singleton {

    // private static Singleton instance;

    private Singleton() {
        System.out.println("Instance is creating .. ");
    }

    // public static Singleton getInstance() {
    // if (instance == null)
    // instance = new Singleton();
    // return instance;
    // }
    /* Synchronized Method */
    // public static synchronized Singleton getInstance() {
    // if (instance == null)
    // instance = new Singleton();
    // return instance;
    // }
    /* Synchronized Block */
    // public static Singleton getInstance() {

    // synchronized (Singleton.class) {
    // if (instance == null)
    // instance = new Singleton();
    // }

    // return instance;
    // }
    /* Double checked in Synchronized Block */

    private static volatile Singleton instance;

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }
}
