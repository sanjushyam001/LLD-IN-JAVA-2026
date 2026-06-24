package LLD.patterns.cloning;

public class Employee implements Cloneable {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + "]";
    }

    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        Address address = new Address();
        address.setCity(this.address.getCity());
        cloned.address = address;

        return cloned;
    }
}
