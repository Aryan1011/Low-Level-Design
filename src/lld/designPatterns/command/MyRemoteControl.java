package lld.designPatterns.command;

// invoker
public class MyRemoteControl {
    ICommand iCommand;

    public MyRemoteControl(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public MyRemoteControl() {
    }

    public void pressButton(){
        iCommand.execute();
    }

    public ICommand getiCommand() {
        return iCommand;
    }

    public void setiCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }
}
