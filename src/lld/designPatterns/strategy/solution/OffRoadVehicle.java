package lld.designPatterns.strategy.solution;

import lld.designPatterns.strategy.solution.strategy.SpecialDriving;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SpecialDriving());
    }

}
