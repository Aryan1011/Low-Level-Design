package lld.designPatterns.factory;

public class Main {
    public static void main(String[] args) {
//      abstract factory is one level up
//      there we make shapeFactory first then we make object from that factory
//      suppose vehicle factory gives either luxury vehicle factory or normal vehicle factory
//      then luxury vehicle factory gives mercedes or bmw
//      then normal vehicle factory gives swift or alto

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        Shape square = shapeFactory.getShape("Square");
        circle.draw();
        square.draw();
    }
}
