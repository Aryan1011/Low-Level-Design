package lld.designPatterns.memento;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    // it has 2 methods

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.width);
    }

    public void restoreMemento(ConfigurationMemento memento){
        this.height = memento.height;
        this.width= memento.width;
    }

}
