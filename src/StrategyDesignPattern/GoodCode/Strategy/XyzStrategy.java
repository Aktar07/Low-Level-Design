package StrategyDesignPattern.GoodCode.Strategy;

public class XyzStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("New Drive Capability");
    }
}
