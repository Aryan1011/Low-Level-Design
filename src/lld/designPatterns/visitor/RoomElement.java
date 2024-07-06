package lld.designPatterns.visitor;

// element is something which have a operation
public interface RoomElement {
    void accept(RoomVisitor visitor);
}
