package Homework6.Products;

import Homework6.Items;
import Homework6.ProductsType.ShoeBrand;
import Homework6.ProductsType.ShoeColor;
import Homework6.ProductsType.ShoeSex;
import Homework6.ProductsType.ShoeType;

public class Shoe extends Items {

    private ShoeBrand brand;
    private ShoeType shoeType;
    private ShoeSex shoeSex;
    private ShoeColor color;
    private int size;

    public Shoe(ShoeBrand brand,ShoeSex sex,ShoeType type,ShoeColor color,int size, double price) {
        super(price, 5);
        this.brand = brand;
        this.shoeSex = sex;
        this.shoeType = type;
        this.color = color;
        this.size = size;
    }

    public ShoeBrand getBrand() {
        return brand;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public ShoeSex getShoeSex() {
        return shoeSex;
    }

    public ShoeColor getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "price=" + price +
                ", productID=" + productID +
                ", brand='" + brand + '\'' +
                ", shoeType=" + shoeType +
                ", shoeSex=" + shoeSex +
                ", color=" + color +
                ", size=" + size +
                "} " + super.toString();
    }
}
