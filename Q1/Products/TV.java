package Homework6.Products;

import Homework6.Items;

public class TV extends Items {
    private int size;
    private String brand;
    private String model;

    public TV(double price,int size,String brand,String model) {
        super(price, 1);
        this.size = size;
        this.brand = brand;
        this.model = model;
    }


    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                ", productID=" + productID +
                ", size=" + size +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }
}
