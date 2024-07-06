package lld.designPatterns.strategy.solution;

import lld.designPatterns.strategy.solution.strategy.DrivingStrategy;

public class Vehicle {
    public final DrivingStrategy drivingStrategy;

    Vehicle(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }
}
