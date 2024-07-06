package lld.designPatterns.strategy.solution.strategy;

public class NormalDriving implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Drives Normally");
    }
}
