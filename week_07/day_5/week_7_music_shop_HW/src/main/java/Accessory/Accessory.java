package Accessory;

public abstract class Accessory {
    private String make;
    private double buying;
    private double selling;
    private int quantity;

    public Accessory(String make, double buying, double selling, int quantity){
        this.make = make;
        this.buying = buying;
        this.selling = selling;
        this.quantity = quantity;
    }

    public String getMake(){
        return  this.make;
    }

    public double getSellingPrice(){
        return  this.selling;
    }

    public double getBuyingPrice(){
        return  this.buying;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
