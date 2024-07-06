package lld.designPatterns.flyweight.solution;

import lld.designPatterns.flyweight.problem.Sprites;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String,IRobot> cache = new HashMap<>();
    public static IRobot createRobot(String robotType){
        if(cache.containsKey(robotType)){
            return cache.get(robotType);
        }
        else {
            if(robotType == "HUMANOID"){
                Sprites humanoidSprite = new Sprites(null);
                IRobot humaoidRobot = new HumanoidRobot(humanoidSprite,robotType);
                cache.put(robotType,humaoidRobot);
                return humaoidRobot;
            }
            else {
                Sprites dogRobotSprite = new Sprites(null);
                IRobot dogRobot = new RoboticDog(dogRobotSprite,robotType);
                cache.put(robotType,dogRobot);
                return dogRobot;
            }
        }
    }
}
