package Structural_Bridge;

public class AdvanceRemote extends BasicRemote {

    public AdvanceRemote(Device device) {
        super(device);
    }
    public void mute(){
        System.out.println("device is muted");
        device.setVolume(0);
    }
}
