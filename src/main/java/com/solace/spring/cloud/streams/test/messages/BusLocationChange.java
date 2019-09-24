package com.solace.spring.cloud.streams.test.messages;

public class BusLocationChange {
	/** 
	* Message payload
	*/
	private com.solace.spring.cloud.streams.test.types.BusGeoSchema schema;
	private com.solace.spring.cloud.streams.test.types.BusGeoLocation payload;

	
	public void setSchema (final com.solace.spring.cloud.streams.test.types.BusGeoSchema schema) {
		this.schema = schema;
	}

	public void setPayload(final com.solace.spring.cloud.streams.test.types.BusGeoLocation payload) {
		this.payload = payload;
	}
	
	public com.solace.spring.cloud.streams.test.types.BusGeoSchema  getSchema() {
		return this.schema;
	}
	
	public com.solace.spring.cloud.streams.test.types.BusGeoLocation getPayload() {
		return this.payload;
	}
	
	

}
