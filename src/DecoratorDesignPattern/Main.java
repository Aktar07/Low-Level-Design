package DecoratorDesignPattern;

import DecoratorDesignPattern.BaseModel.BasePizza;
import DecoratorDesignPattern.BaseModel.Margherita;
import DecoratorDesignPattern.BaseModel.VegDelight;
import DecoratorDesignPattern.Decorator.ExtraCheese;
import DecoratorDesignPattern.Decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Total Cost of the Pizza with extra toppings : Rs. "+pizza.cost());

        BasePizza pizza2 = new Mushroom(new VegDelight());
        System.out.println("Total Cost of the Pizza with extra toppings : Rs. "+pizza2.cost());
    }
}
