package StrategyDesignPattern.GoodCode;

public class main {

    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();
    }
}
