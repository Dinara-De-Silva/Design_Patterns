package Structural_Bridge;

public class Radio implements Device{
    private boolean on=false;
    private int volume=45;
    private int channel=0;
    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void enable() {
        this.on=true;
    }

    @Override
    public void disable() {
        this.on=false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if(volume>100)
            this.volume=100;
        else if(volume<0)
            this.volume=0;
        else
            this.volume=volume;

    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChanel(int channelNumber) {
        if (0<=channelNumber && channelNumber<=10)
            this.channel=channelNumber;
        else
            System.err.println("Invalid Channel Number!");
    }

    @Override
    public void printStatus() {
        System.out.println("-----------------------------------------");
        System.out.println("| I am Radio.");
        System.out.println("| I'm "+(on? "enabled.":"disabled."));
        System.out.println("| Current volume is "+volume+"%.");
        System.out.println("| Current channel is "+channel+".");
        System.out.println("-----------------------------------------\n");
    }
}
