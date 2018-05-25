package Instruments;

public abstract class Instruments {
    private String make;
    private String model;
    private double buying;
    private double selling;


    public Instruments(String make, String model, double buying, double selling){
        this.make = make;
        this.model = model;
        this.buying = buying;
        this.selling = selling;
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

}
