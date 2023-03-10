package com.rg.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg" )
public class ElectricEngine implements Engine {

	public ElectricEngine() {
		System.out.println("ElectricEngine::0-param constructor");
	}
    @Override
	public void start() {
		System.out.println("ElectricEngine.start()");
		
	}
    @Override
    public void stop() {
    	System.out.println("ElectricEngine.Stop()");
    }
}

