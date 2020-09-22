package com.company.practice2Facade;

import com.company.practice2Facade.AirFlow.AirFlowController;
import com.company.practice2Facade.Cooling.CoolingController;
import com.company.practice2Facade.Fuel.FuelInjector;

public class Starter {

    public void start(){
        CoolingController coolingController = new CoolingController();
        AirFlowController airFlowController = new AirFlowController();
        FuelInjector fuelInjector = new FuelInjector();
        CatalyticConverter catalyticConverter = new CatalyticConverter();


        catalyticConverter.on();
        coolingController.run();
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();

        fuelInjector.off();
        coolingController.stop();
        airFlowController.off();
        catalyticConverter.off();
    }

}
