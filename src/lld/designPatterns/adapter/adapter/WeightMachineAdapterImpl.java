package lld.designPatterns.adapter.adapter;

import lld.designPatterns.adapter.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    public final WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKg() {
        int weight = weightMachine.getWeightInPounds();
        // do conversion
        return 40+weight;
    }
}
