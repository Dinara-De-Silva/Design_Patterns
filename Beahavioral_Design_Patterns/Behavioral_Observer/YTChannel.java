package Behavioral_Observer;

import java.util.ArrayList;
import java.util.List;

public class YTChannel {
    private String channelName;
    private List<Subscriber> subscriberList;
    private String videoName;
    public YTChannel(String name){
        this.channelName=name;
        subscriberList=new ArrayList<>();
    }
    public String getChannelName() {
        return channelName;
    }

    public void subscribe(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }
    public void unSubscribed(Subscriber subscriber){
        this.subscriberList.remove(subscriber);
    }
    public void addVideo(String videoName){
        this.videoName=videoName;
        update();

    }
    public void update(){
        for (Subscriber subscriber:subscriberList){
            subscriber.getNotification("hey "+subscriber.getName()+"! "
                    +this.channelName+" had added a new video : "+this.videoName);
        }
    }
}
