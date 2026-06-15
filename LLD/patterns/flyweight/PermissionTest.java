package LLD.flyweight;

import java.util.Set;

public class PermissionTest {
    public static void main(String[] args) {

        Set<Permission> adminPermissions = Set.of(
                PermissionFactory.getPermission("READ_PRODUCT"),
                PermissionFactory.getPermission("UPDATE_PRODUCT"),
                PermissionFactory.getPermission("DELETE_PRODUCT"),
                PermissionFactory.getPermission("CREATE_PRODUCT"));

        Set<Permission> userPermissions = Set.of(
                PermissionFactory.getPermission("READ_PRODUCT"),
                PermissionFactory.getPermission("UPDATE_PRODUCT"));

        User admin = new User("ADMIN", adminPermissions);
        User user = new User("USER", userPermissions);

        System.out.println(admin.getName() + " \n" + admin.getPermissions());
        System.out.println(user.getName() + " \n" + user.getPermissions());
    }
}
