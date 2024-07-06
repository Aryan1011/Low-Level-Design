package lld.designPatterns.command;

public class Main {
    // undo, redo or any command in a remote control
    // Ac class with isOn and temperature and client operating it using getter setter
    // problem is client has to know about all features (so lack of abstraction)

    // How to do undo, redo (if its on and you off it, its not undo) its only
    // possible becoz client has knowledge how to turn off
    // client uses invoker to generate a command that is run by receiver
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        MyRemoteControl remoteObj = new MyRemoteControl();

        remoteObj.setiCommand(new TurnAcOnCommand(ac));
        remoteObj.pressButton();
        // Make a stack of ICommand
        // on  a call add that command to stack
        // undo will pop up last element and will call its undo operation
        // so implement undo in command class

    }
}
