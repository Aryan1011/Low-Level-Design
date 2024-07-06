package lld.designPatterns.command;

// its a receiver
public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc(){
        isOn=true;
        System.out.println("Ac On");
    }
    public void turnOffAc(){
        isOn=false;
        System.out.println("Ac Off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
