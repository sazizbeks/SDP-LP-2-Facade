package com.company.practice2Facade.Cooling;

public class CoolingController {
    private Radiator radiator;
    private TemperatureSensor temperatureSensor;

    private int temperatureUpperLimit;

    public void setTemperatureUpperLimit(int upperLimit) {
        temperatureUpperLimit = upperLimit;
    }

    public void run() {
        radiator = new Radiator();
        temperatureSensor = new TemperatureSensor();
        radiator.on();
    }

    public void cool() {
        if (temperatureSensor.getTemperature() > temperatureUpperLimit){
            System.out.println("Cooling system is cooling.");
        }
    }

    public void stop() {
        cool();
        radiator.off();
    }
}
