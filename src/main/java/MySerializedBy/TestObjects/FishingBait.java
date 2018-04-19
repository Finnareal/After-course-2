package MySerializedBy.TestObjects;

import MySerializedBy.SerializedBy;
import MySerializedBy.SerializedByProcessor;

//@SerializedBy(value = SerializedByProcessor.class)
public class FishingBait {
    private String baitMaterial;
    private double baitSize;
    private String baitColor;

    public FishingBait(String baitMaterial, double baitSize, String baitColor) {
        this.baitMaterial = baitMaterial;
        this.baitSize = baitSize;
        this.baitColor = baitColor;
    }

}
