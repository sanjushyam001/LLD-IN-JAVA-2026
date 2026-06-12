package patterns.proxy;

public class RealInternet implements Internet {

    @Override
    public void connect(String website) {
        System.out.println("Internet Connected : " + website);
    }

}
