package lld.designPatterns.flyweight.problem;

import java.util.List;

public class Sprites {
    List<String> largeData;

    public Sprites(List<String> largeData) {
        this.largeData = largeData;
    }

    public List<String> getLargeData() {
        return largeData;
    }

    public void setLargeData(List<String> largeData) {
        this.largeData = largeData;
    }
}
