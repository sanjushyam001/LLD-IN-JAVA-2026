package LLD.patterns.cloning;

public class Main {

    public static void main(String[] args) throws Exception {

        Address address = new Address();
        address.setCity("Mumbai");

        Employee employee1 = new Employee("Rohit", address);
        System.out.println(employee1);

        Employee employee2 = (Employee) employee1.clone();
        System.out.println(employee2);
        employee2.getAddress().setCity("Delhi");
        employee2.setName("Suresh");
        System.out.println(employee1 + " " + employee2);
    }
}
