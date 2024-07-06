package lld.designPatterns.strategy.solution;

import lld.designPatterns.strategy.solution.strategy.NormalDriving;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle() {
        super(new NormalDriving());
    }
}
