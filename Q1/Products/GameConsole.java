package Homework6.Products;

import Homework6.Items;
import Homework6.ProductsType.GameConsoleBrand;

public class GameConsole extends Items {

    private GameConsoleBrand brand;
    private String model;
    private String capacity;

    public GameConsole(GameConsoleBrand brand, String model,String capacity,double price) {
        super(price, 2);
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    public GameConsoleBrand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", price=" + price +
                ", productID=" + productID +
                "} " + super.toString();
    }
}
