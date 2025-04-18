package StrategyDesignPattern.GoodCode;

import StrategyDesignPattern.GoodCode.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObj;

    Vehicle(DriveStrategy driveObj){
        this.driveObj = driveObj;
    }

    public void drive(){
        driveObj.drive();
    }
}
