package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.BaseModel.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}