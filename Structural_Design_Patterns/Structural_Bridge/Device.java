package Structural_Bridge;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChanel(int channelNumber);
    void printStatus();
}
