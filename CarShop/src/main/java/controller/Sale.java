package controller;

public class Sale {
    private final int carId;
    private final double total;
    private final int quantity;

    public Sale(int carId, double total, int quantity) {
        this.carId = carId;
        this.total = total;
        this.quantity = quantity;
    }


    public int getCarId() {
        return carId;
    }

    public double getTotal() {
        return total;
    }

    public int getQuantity() {
        return quantity;
    }
}
