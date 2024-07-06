package lld.designPatterns.mediator;

public class Main {
    // Online auction system (2 bidder talk), Airline management system (2 plane talk)
    // chat application (where they dont need to chat directly
    // 2 objects communicate through the mediator

    // dont confuse with proxy because here intend is that 2 objects shouldnt talk to each other
    // dont confuse with proxy, in proxy it is lazy loading (it verifies and then requests)
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1 = new Bidder(auctionMediator,"A");
        Colleague bidder2 = new Bidder(auctionMediator,"B");
        bidder1.placeBid(10);
        bidder2.placeBid(20);
    }
}
