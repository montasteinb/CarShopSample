package entity;

public class Car {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private CarType carType;

    public Car(int id, String name, double price, int quantity, CarType carType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.carType = carType;
    }

    public Car(){
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String toString(){
        return
                id + " | \t" + name + " | \t" + price + " | \t" + quantity + " | \t" + carType;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
