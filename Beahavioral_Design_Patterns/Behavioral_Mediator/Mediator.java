package Behavioral_Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements AuctionMediator{
    private List<Colleague> bidders=new ArrayList<>();
    private int currentBid=0;

    @Override
    public void addBidder(Colleague bidder) {
        bidders.add(bidder);
    }
    @Override
    public void placeBid(Colleague bidder, int amount) {

        currentBid+=amount;
        for(Colleague competitor:bidders){
            if (competitor!=bidder){
                competitor.receiveBidNotification(amount);
            }
        }
    }
}
