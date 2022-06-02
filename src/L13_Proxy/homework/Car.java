package L13_Proxy.homework;

public class Car {

    private Long id;
    private String brand;
    private String color;
    private String number;
    private Driver owner;
    private boolean isStolen;

    public Car(Long id, String brand, String color, String number, Driver owner, Boolean isStolen) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.number = number;
        this.owner = owner;
        this.isStolen = isStolen;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public Driver getOwner() {
        return owner;
    }

    public boolean isStolen() {
        return isStolen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", owner=" + owner +
                ", isStolen=" + isStolen +
                '}';
    }
}
