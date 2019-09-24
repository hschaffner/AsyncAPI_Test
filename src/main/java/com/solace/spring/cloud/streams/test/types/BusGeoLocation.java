package com.solace.spring.cloud.streams.test.types;

public class BusGeoLocation {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	private java.lang.Integer vehicleNum;

	public void setVehicleNum(final java.lang.Integer vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public java.lang.Integer getVehicleNum() {
		return this.vehicleNum;
	}

	private java.lang.Double lon;

	public void setLon(final java.lang.Double lon) {
		this.lon = lon;
	}

	public java.lang.Double getLon() {
		return this.lon;
	}

	private java.lang.Double lat;

	public void setLat(final java.lang.Double lat) {
		this.lat = lat;
	}

	public java.lang.Double getLat() {
		return this.lat;
	}

	private java.lang.Integer speed;

	public void setSpeed(final java.lang.Integer speed) {
		this.speed = speed;
	}

	public java.lang.Integer getSpeed() {
		return this.speed;
	}

	private java.lang.Integer routeNum;

	public void setRouteNum(final java.lang.Integer routeNum) {
		this.routeNum = routeNum;
	}

	public java.lang.Integer getRouteNum() {
		return this.routeNum;
	}

	/** 
 * The Status Schema
 */
  public static enum Status
	{  OK("OK"),   STOP("STOP"),   FAIL("FAIL"),   START("START"), STOPPED("STOPPED"), FLAT_TIRE("FLAT_TIRE") ;
	private final String value;

	private Status(  final String value){
    this.value=value;
  }

	public @Override String toString() {
		return this.value;
	}}

	private com.solace.spring.cloud.streams.test.types.BusGeoLocation.Status status;

	public void setStatus(final com.solace.spring.cloud.streams.test.types.BusGeoLocation.Status status) {
		this.status = status;
	}

	public com.solace.spring.cloud.streams.test.types.BusGeoLocation.Status getStatus() {
		return this.status;
	}

}
