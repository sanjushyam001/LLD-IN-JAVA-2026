package LLD.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PermissionFactory {

    private static final Map<String, Permission> CACHE = new ConcurrentHashMap<>();

    public static Permission getPermission(String type) {
        return CACHE.computeIfAbsent(type, Permission::new);
    }
}
