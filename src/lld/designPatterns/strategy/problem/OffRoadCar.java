package lld.designPatterns.strategy.problem;

public class OffRoadCar extends Vehicle{
    @Override
    public void drive() {
        // same code is implemented by Sports car also
        // with time code duplication and difficulty in maintaining it increases.
        System.out.println("Drives Specially");
    }
}
