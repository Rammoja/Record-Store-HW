package Instruments;
import Interface.IPlay;
import Interface.ISell;

public class Drums extends Instruments implements IPlay{

    public Drums( String make, String model, double buying, double selling, int quantity){
        super(make,model,buying,selling, quantity);
    }

    public String play(String playing) {
        return "Drums Playing " + playing;
    }



}


