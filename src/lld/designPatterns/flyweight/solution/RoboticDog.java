package lld.designPatterns.flyweight.solution;

import lld.designPatterns.flyweight.problem.Sprites;

public class RoboticDog implements IRobot{

    private String type;
    private Sprites sprites;

    public RoboticDog(Sprites sprites, String type) {
        this.sprites = sprites;
        this.type = type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display(int x, int y) {

    }
}
