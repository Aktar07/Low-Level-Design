package StrategyDesignPattern.GoodCode;

import StrategyDesignPattern.GoodCode.Strategy.DriveStrategy;
import StrategyDesignPattern.GoodCode.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
