package lld.designPatterns.adapter;

import lld.designPatterns.adapter.adaptee.WeightMachineForBabies;
import lld.designPatterns.adapter.adapter.WeightMachineAdapter;
import lld.designPatterns.adapter.adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
