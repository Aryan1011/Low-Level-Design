package lld.designPatterns.flyweight.solution;

import lld.designPatterns.flyweight.problem.Sprites;

public class HumanoidRobot implements IRobot{

    private String type;
    private Sprites body;

    public HumanoidRobot(Sprites body, String type) {
        this.body = body;
        this.type = type;
    }

    public Sprites getBody() {
        return body;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display(int x, int y) {

    }
}
