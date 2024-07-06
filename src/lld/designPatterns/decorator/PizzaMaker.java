package lld.designPatterns.decorator;

import lld.designPatterns.decorator.decorator.ExtraCheese;
import lld.designPatterns.decorator.decorator.Mushroom;

public class PizzaMaker {
    public static void main(String[] args) {
        BasePizza margheritaPizza = new MargheritaPizza();
        BasePizza pizza = new ExtraCheese(margheritaPizza); // marghareita + extra cheese
        System.out.println(pizza.cost());
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new VegDelightPizza()));
        System.out.println(pizza1.cost());
    }
}
