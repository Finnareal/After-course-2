package MyToString;

public class Spinning {
    private String spinningMaker;
    private SpinningRod spinningRod;
    private double spinningPrice;
    private SpinningReel spinningReel;

    public Spinning(String spinningMaker, double spinningPrice) {
        this.spinningMaker = spinningMaker;
        this.spinningRod = getSpinningRod();
        this.spinningPrice = spinningPrice;
        this.spinningReel = getSpinningReel();
    }

    private SpinningReel getSpinningReel(){
        spinningReel = new SpinningReel("Shimano", 5450d, true);
        return spinningReel;
    }

    private SpinningRod getSpinningRod(){
        spinningRod = new SpinningRod("Rod Maker", 2.7d, false);
        return spinningRod;
    }

}
