package patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();

    List<String> blockWebsites = new ArrayList<>();

    public void addUrl(String website) {
        blockWebsites.add(website);
    }

    @Override
    public void connect(String website) {

        if (!blockWebsites.contains(website)) {
            internet.connect(website);
            return;
        }
        System.out.println("Can't connect given website is blocked");
    }

}
