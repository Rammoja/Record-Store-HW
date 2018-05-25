package Instruments;
import Interface.IPlay;

public class Drums extends Instruments implements IPlay{

    public Drums( String make, String model, double buying, double selling){
        super(make,model,buying,selling);
    }

    public String play(String playing) {
        return "Drums Playing " + playing;
    }
}
