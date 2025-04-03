package StrategyDesignPattern.GoodCode;

import StrategyDesignPattern.GoodCode.Strategy.DriveStrategy;
import StrategyDesignPattern.GoodCode.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
