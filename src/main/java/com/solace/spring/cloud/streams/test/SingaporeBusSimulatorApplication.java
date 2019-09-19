package com.solace.spring.cloud.streams.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.solace.spring.cloud.streams.test.types.*;
import com.solace.spring.cloud.streams.test.messages.*;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.cloud.stream.messaging.Processor;
import com.solace.spring.cloud.streams.test.types.BusGeoLocation;

@SpringBootApplication
//@EnableBinding(Source.class)
@EnableBinding(Processor.class)
public class SingaporeBusSimulatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(SingaporeBusSimulatorApplication.class, args);
	}

	//    @InboundChannelAdapter(Processor.OUTPUT)
	//    public BusLocationChange sendBusLocationChange() {
	// Add Business Logic Here.
	//    }

	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public  BusLocationChange sendBusLocationChange(BusGeoLocation msg) {
		
		BusGeoLocation location = new BusGeoLocation();
		location.setLat(msg.getLat());
		location.setLon(msg.getLon());
		location.setRouteNum(msg.getRouteNum());
		location.setSpeed(msg.getSpeed());
		location.setStatus(msg.getStatus());
		location.setVehicleNum(msg.getVehicleNum());
		
		BusLocationChange change = new BusLocationChange();
		change.setPayload(location);
		
		return change;

	}

}
