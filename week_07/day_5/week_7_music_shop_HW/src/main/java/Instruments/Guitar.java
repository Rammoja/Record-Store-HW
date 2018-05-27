package Instruments;
import Interface.IPlay;

public class Guitar extends Instruments implements IPlay {

    public Guitar(String make, String model, double buying, double selling, int quantity) {
        super(make, model, buying, selling, quantity);
    }

    public String play(String playing) {
        return "Guitar Playing " + playing;
    }
}