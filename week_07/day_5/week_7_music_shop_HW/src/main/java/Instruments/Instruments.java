package Instruments;

public abstract class Instruments {
    protected String make;
    private String model;
    private double buying;
    private double selling;
    private int quantity;


    public Instruments(String make, String model, double buying, double selling, int quantity){
        this.make = make;
        this.model = model;
        this.buying = buying;
        this.selling = selling;
        this.quantity = quantity;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public double getSellingPrice(){
        return this.selling;
    }

    public double getBuyingPrice(){
        return this.buying;
    }

    public void changeBuyingPrice(double newBuyingPrice) {
        this.buying = newBuyingPrice;

    }

    public void changeSellingPrice(double newSellingPrice) {
        this.selling = newSellingPrice;

    }

    public int getQuantity() {
        return this.quantity;
    }
}
