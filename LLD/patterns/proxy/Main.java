package patterns.proxy;

public class Main {

    public static void main(String[] args) {

        Internet proxyInternet = new ProxyInternet();
        ProxyInternet p = new ProxyInternet();
        p.addUrl("www.hello.com");
        proxyInternet.connect("www.instagram.com");
    }
}
