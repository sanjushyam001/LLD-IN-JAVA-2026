package LLD.patterns.bridge;

public class Main {
    public static void main(String[] args) {

        Engine dieselEngine = new DieselEngine();
        Engine petrolEngine = new PetrolEngine();
        Car marutiCarDiesel = new MarutiCar(dieselEngine);
        marutiCarDiesel.drive();
        Car marutiCarPetrol = new MarutiCar(petrolEngine);
        marutiCarPetrol.drive();

        Car suvCarPetrol = new SuvCar(petrolEngine);
        Car suvCarDiesel = new SuvCar(dieselEngine);

        suvCarPetrol.drive();
        suvCarDiesel.drive();

    }
}
