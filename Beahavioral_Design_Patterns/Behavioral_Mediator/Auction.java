package Behavioral_Mediator;

public class Auction {
    public static void main(String Arg[]){
        AuctionMediator mediator=new Mediator();

        Bidder bidder1=new Bidder("Mr.Dhanush",mediator);
        Bidder bidder2=new Bidder("Sharuh",mediator);
        Bidder bidder3=new Bidder("Kusal Mendis",mediator);

        mediator.addBidder(bidder1);
        mediator.addBidder(bidder2);
        mediator.addBidder(bidder3);

        bidder1.placeBid(50000);
        bidder2.placeBid(25000);
        bidder3.placeBid(32000);
    }
}
