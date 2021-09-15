package Homework6;

public class Items {


    protected double price;
    protected int productID;

    public Items( double price, int productID) {
        this.price = price;
        this.productID = productID;
    }


    public double getPrice() {
        return price;
    }

    public int getProductID(){
        return productID;
    }




}
