package LLD.flyweight;

import java.util.Set;

public class User {

    private String name;
    private Set<Permission> permissions;

    public User(String name, Set<Permission> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

}
