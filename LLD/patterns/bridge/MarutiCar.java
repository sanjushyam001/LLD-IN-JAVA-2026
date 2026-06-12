package LLD.patterns.bridge;

public class MarutiCar extends Car {

    public MarutiCar(Engine engine) {
        super(engine);
        // TODO Auto-generated constructor stub
    }

    @Override
    void drive() {
        System.out.println("MarutiCar -- >" + engine.start());
    }

}
