package com.company.practice2Facade.Fuel;

public class FuelInjector {
    private FuelPump fuelPump;

    public void on() {
        fuelPump = new FuelPump();
    }

    public void inject() {
        fuelPump.pump();
    }

    public void off() {
        System.out.println("Fuel Injector off.");
    }
}
