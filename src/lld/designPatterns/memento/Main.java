package lld.designPatterns.memento;

public class Main {
    // undo functionality/snapshot design pattern
    //Originator - for which we have to hold state
    //memento - holds state of originator
    // caretaker - List<memento>
    public static void main(String[] args) {
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(5,10);
        ConfigurationMemento snapshot = originator.createMemento();
        configurationCareTaker.addMemento(snapshot);
        originator.setHeight(10);
        originator.setWidth(10);

        ConfigurationMemento configurationMemento = configurationCareTaker.undo();
        originator.restoreMemento(configurationMemento);
        System.out.println(originator.getHeight()+ " "+ originator.getWidth());


    }
}
