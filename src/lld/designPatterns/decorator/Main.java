package lld.designPatterns.decorator;

public class Main {
    // there was an object with feature 1
    // Now you made an object that contains this object and adds some extra feature
    // Pizza, then decorated with extraCheese Pizza, then with ExtraTopping
    // you can also add cheese twice, both are objects but other is decorated
    // why need? Class exposure (if you have pizza and 4 options then will you implement
    // all the combinations?) (cheese, cheese + mushroom + extra cheese, extra cheese + mushroom)
    // question - design a pizza machine, coffee machine

    // Apply coupons on cart, coupons can be many

    /*
        abstract base Pizza has cost() method
        Margharita IS A basePizza has cost 100
        veg delight IS A basePizza has cost 200

        Now you have abstract ToppingDecorator
        it HAS A basePizza and also it IS A pizza
        Extra cheese has cost of Pizza.cost+10
        Mushrom IS a BasePizza
     */

}
