package lld.designPatterns.nullHandling;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("bike3");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        // no need to handle null check here
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());

    }
}
