package Behavioral_Mediator;

public interface Colleague {
    void placeBid(int biddingAmount);
    void receiveBidNotification(int amount);
    String getName();
}
