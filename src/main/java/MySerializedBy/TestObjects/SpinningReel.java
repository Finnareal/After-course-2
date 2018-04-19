package MySerializedBy.TestObjects;

import MySerializedBy.SerializedBy;
import MySerializedBy.SerializedByProcessor;

@SerializedBy(value = SerializedByProcessor.class)
public class SpinningReel {
    private String reelMaker;
    private Spool spool;
    private double reelPrice;
    private boolean isInertial;

    public SpinningReel(String reelMaker, Double reelPrice, boolean isInertial) {
        this.reelMaker = reelMaker;
        this.reelPrice = reelPrice;
        this.isInertial = isInertial;
        this.spool = getSpool();
    }

    private Spool getSpool(){
        spool = new Spool("Steel",2000, true);
        return spool;
    }

}
