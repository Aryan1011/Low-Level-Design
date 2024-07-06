package lld.designPatterns.nullHandling;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicle) {
        if(vehicle=="bike"){
            return new Bike();
        }
        // no need to pass null here
        return new NullVehicle();
    }
}
