package StrategyDesignPattern.GoodCode.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive capabilty");
    }
}
