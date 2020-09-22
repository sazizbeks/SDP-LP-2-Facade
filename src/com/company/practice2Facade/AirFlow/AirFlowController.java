package com.company.practice2Facade.AirFlow;

public class AirFlowController {

    private AirFlowMeter airFlowMeter;

    public void takeAir(){
        airFlowMeter = new AirFlowMeter();
        airFlowMeter.getMeasurement();
    }

    public void off(){
        System.out.println("Air flow controller off.");
    }

}
