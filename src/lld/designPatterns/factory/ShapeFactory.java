package lld.designPatterns.factory;

public class ShapeFactory {
    Shape getShape(String input){
        return switch (input) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
