package lld.designPatterns.adapter.adaptee;

public class WeightMachineForBabies implements WeightMachine{

    @Override
    public Integer getWeightInPounds() {
        return 28;
    }
}
