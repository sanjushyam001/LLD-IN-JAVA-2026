package LLD.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String, Tree> cache = new HashMap<>();

    public static Tree getTree(String type) {

        if (!cache.containsKey(type)) {

            if ("oak".equals(type))
                cache.put(type, new Oak());
        }
        return cache.get(type);
    }
}
