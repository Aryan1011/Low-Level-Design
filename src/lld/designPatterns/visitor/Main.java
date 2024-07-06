package lld.designPatterns.visitor;

public class Main {
    /* If a class is tested with 3 function
    and another function comes so you have to test it again
    Visitor allows to adding new features without changing their structure
    It separates operation from the class
     */
    /*
    * Growth is now horizontally not vertically
    * */
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        RoomVisitor pricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(pricingVisitor);
        System.out.println(((SingleRoom)singleRoom).roomPrice);

        doubleRoom.accept(pricingVisitor);
        System.out.println(((DoubleRoom)doubleRoom).roomPrice);

        deluxeRoom.accept(pricingVisitor);
        System.out.println(((DeluxeRoom)deluxeRoom).roomPrice);

        // single dispatch - when invoked method depends upon 1 object at runtime (get room price)
        //double dispatch - when it depends on 2 objects (visit method - depends on caller and argument passed)
        // strategy is for separation of algo, this is for separation of methods


    }
}
