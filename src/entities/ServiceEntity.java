package entities;

public class ServiceEntity {
    private static int autoId;

    private int id;
    private String name;
    private double price;
    private String unit;

    public ServiceEntity() {
    }

    public ServiceEntity(String name, double price, String unit) {
        this.id = 100 + (++autoId);
        this.name = name;
        this.price = price;
        this.unit = unit;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
