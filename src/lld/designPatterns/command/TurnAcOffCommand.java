package lld.designPatterns.command;

public class TurnAcOffCommand implements ICommand{
    AirConditioner ac;

    public TurnAcOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAc();
    }
}
