package lld.designPatterns.decorator.decorator;

import lld.designPatterns.decorator.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
