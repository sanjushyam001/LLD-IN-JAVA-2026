package patterns.template;

public class Main {

    public static void main(String[] args) {

        Bevrage tea = new Tea();
        tea.makeDrink();
        System.out.println("---------------");
        Bevrage coffee = new Coffee();
        coffee.makeDrink();
    }
}
