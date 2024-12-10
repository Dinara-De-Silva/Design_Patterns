package Behavioral_Mediator;

public interface AuctionMediator {
    void placeBid(Colleague bidder,int amount);
    void addBidder(Colleague bidder);
}
