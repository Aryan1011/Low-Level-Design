package lld.designPatterns.strategy.solution.strategy;

public class SpecialDriving implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Drives Specially");
    }
}
