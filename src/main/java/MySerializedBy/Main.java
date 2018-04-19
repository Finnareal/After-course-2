package MySerializedBy;

import MySerializedBy.TestObjects.FishingBait;
import MySerializedBy.TestObjects.SpinningReel;
import MySerializedBy.TestObjects.Spool;

public class Main {
    public static void main(String[] args) throws AnnotationSerializedByNotFound, IllegalAccessException {

        FishingBait fishingBait = new FishingBait("Silicon", 9.5d, "White");
        Spool spool = new Spool("Steel",2000, true);
        SpinningReel spinningReel = new SpinningReel("Maker", 4680d, true);

        SerializedByProcessor processor = new SerializedByProcessor();

        System.out.println(processor.serialize(spool));
        System.out.println(processor.serialize(spinningReel));
        System.out.println(processor.serialize(fishingBait));

    }
}
