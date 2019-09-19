package com.solace.spring.cloud.streams.test.messages;

public class BusLocationChange {
	/** 
	* Message payload
	*/
	private com.solace.spring.cloud.streams.test.types.BusGeoLocation payload;

	public void setPayload(final com.solace.spring.cloud.streams.test.types.BusGeoLocation payload) {
		this.payload = payload;
	}

	public com.solace.spring.cloud.streams.test.types.BusGeoLocation getPayload() {
		return this.payload;
	}
}
