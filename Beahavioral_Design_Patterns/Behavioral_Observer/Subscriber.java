package Behavioral_Observer;

import java.nio.channels.Channel;

public class Subscriber {
    private String name;
    private YTChannel channel;
    public Subscriber(String name){
        this.name=name;
    }
    public void subscribeAChannel(YTChannel channel){
        channel.subscribe(this);
        this.channel=channel;
        System.out.println(this.name+" subscribed "+channel.getChannelName());
    }
    public void unSubscribeChannel(){
        this.channel.unSubscribed(this);
        this.channel=null;
    }
    public void getNotification(String message){
        System.out.println(message);
    }

    public String getName() {
        return name;
    }
}
