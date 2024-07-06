package lld.designPatterns.flyweight.problem;

public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        // creation of object is very expensive
        for (int i=0;i<5000;i++){
            Sprites humanoidSprite = new Sprites(null);
            Robot humanoidRobotObject = new Robot(humanoidSprite,"HUMANOID",x+i,y+i);
        }
        for (int i=0;i<5000;i++){
            Sprites roboticDogSprite = new Sprites(null);
            Robot humanoidRobotObject = new Robot(roboticDogSprite,"ROBOTIC_DOG",x+i,y+i);
        }
    }
}
