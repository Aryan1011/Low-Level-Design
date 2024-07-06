package lld.designPatterns.mediator;

public interface AuctionMediator {
     void addBidder(Bidder bidder);
     void placeBid(Bidder bidder, int bidAmount);
}
