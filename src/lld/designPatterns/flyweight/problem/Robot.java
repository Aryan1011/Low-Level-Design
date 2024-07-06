package lld.designPatterns.flyweight.problem;

public class Robot {
    int yCordinate;
    int xCordinate;
    String type;
    Sprites body;// big body that is duplicated

    public Robot(Sprites body, String type, int xCordinate, int yCordinate) {
        this.body = body;
        this.type = type;
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }
}
