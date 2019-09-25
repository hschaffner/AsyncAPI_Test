package com.solace.spring.cloud.streams.test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.solace.spring.cloud.streams.test.types.*;
import com.solace.spring.cloud.streams.test.messages.*;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.binding.BinderAwareChannelResolver;
import org.springframework.messaging.Message;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.support.MessageBuilder;

import com.solace.spring.cloud.streams.test.types.BusGeoLocation;
import com.spring.cloud.streams.test.schema.BusGeoSchemaSer;

@SpringBootApplication
//@EnableBinding(Source.class)
@EnableBinding(Sink.class)
public class SingaporeBusSimulatorApplication {
	
	@Value("${spring.cloud.stream.bindings.output.destination}") 
	private String topic;
	
	@Autowired
	// Registered via the @EnableBinding annotation & allows target destination to be determined at runtime
	private BinderAwareChannelResolver resolver;
	
	public static void main(String[] args) {
		SpringApplication.run(SingaporeBusSimulatorApplication.class, args);
	}

	//    @InboundChannelAdapter(Processor.OUTPUT)
	//    public BusLocationChange sendBusLocationChange() {
	// Add Business Logic Here.
	//    }

	
	@StreamListener(Processor.INPUT)
	public  void sendBusLocationChange(BusGeoLocation msg) {
		
		//Prepare message payload
		BusGeoLocation location = new BusGeoLocation();
		location.setLat(msg.getLat());
		location.setLon(msg.getLon());
		location.setRouteNum(msg.getRouteNum());
		location.setSpeed(msg.getSpeed());
		location.setStatus(msg.getStatus());
		location.setVehicleNum(msg.getVehicleNum());

		//Prepare JSON for "schema" portion of JSON message
		BusGeoSchemaSer schemaSer = new BusGeoSchemaSer();
		BusGeoSchema busSchema = new BusGeoSchema();
		busSchema.setSchema(schemaSer.getBusSchemaSer());
		
		
		//Republish message for Kafka as JSON {"schema" : {}, "payload" : {} }
		BusLocationChange changeOut = new BusLocationChange();
		changeOut.setSchema(busSchema);
		changeOut.setPayload(location);
		
		System.out.println("Sent msg: " + "Bus: " + location.getVehicleNum() + " Route: " +
		location.getRouteNum() + " Status: " + location.getStatus() + " Speed: " + location.getSpeed());
		
		//Dynamic publishing based on application.yml 
		resolver.resolveDestination(topic).send(message(changeOut));

		
	}
	
	private static final <T> Message<T> message(T val) {
        return MessageBuilder.withPayload(val).build();

	}
	
}
