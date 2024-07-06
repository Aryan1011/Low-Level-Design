package lld.designPatterns.command;

public class TurnAcOnCommand implements ICommand{
    AirConditioner ac;

    public TurnAcOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }
}
