package lld.designPatterns.strategy.solution;


public class Main {
    public static void main(String[] args) {
//        Now there will be no Code duplication
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new PassengerVehicle();
        vehicle1.drive();

        // Bridge Design pattern
        // here we also have a strategy interface
        // there is a difference of intend only
        // strategy - we want to dynamically change the behaviour of object (during runtime)
        // both strategy and your abstract class should grow independently
    }
}
