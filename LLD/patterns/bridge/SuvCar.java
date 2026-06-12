package LLD.patterns.bridge;

public class SuvCar extends Car {

    public SuvCar(Engine engine) {
        super(engine);

    }

    @Override
    public void drive() {
        System.out.println("SuvCar -- > " + engine.start());
    }

}
