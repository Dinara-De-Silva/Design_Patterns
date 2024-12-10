package Structural_Bridge;

public class BasicRemote implements Remote{
    protected Device device;
    public BasicRemote(Device device){
        this.device=device;
    }
    @Override
    public void power() {
        System.out.println("Clicked power button.");
        if (device.isEnable()) {
            device.disable();
            System.out.println("Device turned off.");
        }
        else {
            device.enable();
            System.out.println("Device turned on.");
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Device's volume decreased.");
        device.setVolume(device.getVolume()-5);
    }

    @Override
    public void volumeUp() {
        System.out.println("Device's volume increased.");
        device.setVolume(device.getVolume()+5);
    }

    @Override
    public void channelDown() {
        System.out.println("channel down.");
        device.setChanel(device.getChannel()-1);
    }

    @Override
    public void channelUp() {
        System.out.println("channel up.");
        device.setChanel(device.getChannel()+1);
    }
}
