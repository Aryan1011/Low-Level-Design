package lld.designPatterns.visitor;

public class RoomMaintainenceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Doing Maintaince in single");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Doing Maintaince in Double");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Doing Maintaince in Deluxe");
    }
}
