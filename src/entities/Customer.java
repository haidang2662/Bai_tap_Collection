package entities;

public class Customer {
    private static  int autoId;
    private int id  ;
    private String name;
    private String address;
    private String telephone;
    private CustomerType type;

    public Customer() {
    }

    public Customer(String name, String address, String telephone, CustomerType type) {
        this.id = 10000 + (++autoId);
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", type=" + type.value +
                '}';
    }
}
