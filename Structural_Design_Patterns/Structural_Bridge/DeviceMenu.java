package Structural_Bridge;
//menu for the device example.
public class DeviceMenu {
    public static void main(String[] arg){
        TV myTV = new TV();
        Radio myRadio = new Radio();

        Remote basicRemote = new BasicRemote(myTV);
        AdvanceRemote advancedRemote = new AdvanceRemote(myRadio);
        basicRemote.power();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        myTV.printStatus();

        advancedRemote.power();
        advancedRemote.mute();
        myRadio.printStatus();
    }
}
