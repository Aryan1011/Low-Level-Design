package lld.designPatterns.mediator;

public class Bidder implements Colleague {
    String name;
    AuctionMediator auctionMediator;

    public Bidder(AuctionMediator auctionMediator, String nam) {
        this.auctionMediator = auctionMediator;
        this.name = nam;
        auctionMediator.addBidder(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder "+ name+ " gets the notification that someone has bid "+ bidAmount);
    }

}
