package Behavioral_Mediator;

public class Bidder implements Colleague{
    private AuctionMediator mediator;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Bidder(String name, AuctionMediator mediator) {
        this.mediator = mediator;
        this.name=name;
    }

    @Override
    public void placeBid(int biddingAmount) {
        mediator.placeBid(this,biddingAmount);
    }

    @Override
    public void receiveBidNotification(int amount) {
        System.out.println(this.getName()+" gotta notification someone did a bid of "
                +amount+" Dollars!");
    }
}
