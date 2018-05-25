public abstract class Accessory {
    private String make;
    private double buying;
    private double selling;

    public Accessory(String make, double buying, double selling){
        this.make = make;
        this.buying = buying;
        this.selling = selling;
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
}
