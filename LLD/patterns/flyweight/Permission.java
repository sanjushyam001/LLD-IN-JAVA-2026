package LLD.flyweight;

public class Permission {

    private String permission;

    public Permission(String permission) {
        System.out.println("Permission created . .");
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }

    @Override
    public String toString() {
        return "Permission [permission=" + permission + "]";
    }
    

}
