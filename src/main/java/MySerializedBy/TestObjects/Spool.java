package MySerializedBy.TestObjects;

import MySerializedBy.SerializedBy;
import MySerializedBy.SerializedByProcessor;

@SerializedBy(value = SerializedByProcessor.class)
public class Spool {
    private String spoolMaterial;
    private int spoolVolume;
    private boolean hasBrake;

    public Spool(String spoolMaterial, int spoolVolume, boolean hasBrake) {
        this.spoolMaterial = spoolMaterial;
        this.spoolVolume = spoolVolume;
        this.hasBrake = hasBrake;
    }
}
