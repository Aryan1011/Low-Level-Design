package lld.designPatterns.flyweight.solution;

public class Main {
    public static void main(String[] args) {
        IRobot humanoid = RoboticFactory.createRobot("HUMANOID");
        humanoid.display(1,2);

        // returned from cache and display function is used
        IRobot humanoid2 = RoboticFactory.createRobot("HUMANOID");
        humanoid.display(2,9);

        // same with Dog Robot

        // other question Text editor
        // make a letter interface with display method
        // Intrinsic data is character,font, size (DocumentChar implements letterI)
        // letter factory will share same object and just display it at different places






    }
}
