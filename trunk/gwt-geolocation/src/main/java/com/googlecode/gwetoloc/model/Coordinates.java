package com.googlecode.gwetoloc.model;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * http://dev.w3.org/geo/api/spec-source.html#coordinates
 * 
 * @author Francois 'wokier' Wauquier
 * 
 */
public class Coordinates implements Serializable, IsSerializable {

    private static final long serialVersionUID = 1L;

    private double latitude;
    private double longitude;
    private double accuracy;

    private Double altitude;
    private Double altitudeAccuracy;

    private Double heading;
    private Double speed;

    /**
     * Constructor
     */
    public Coordinates() {
	super();
    }

    /**
     * Constructor with required fields
     * 
     * @param latitude
     * @param longitude
     * @param accuracy
     */
    public Coordinates(double latitude, double longitude, double accuracy) {
	super();
	this.latitude = latitude;
	this.longitude = longitude;
	this.accuracy = accuracy;
    }

    /**
     * Full Constructor
     */
    public Coordinates(double latitude, double longitude, double accuracy, Double altitude, Double altitudeAccuracy, Double heading, Double speed) {
	super();
	this.latitude = latitude;
	this.longitude = longitude;
	this.accuracy = accuracy;
	this.altitude = altitude;
	this.altitudeAccuracy = altitudeAccuracy;
	this.heading = heading;
	this.speed = speed;
    }

    @Override
    public String toString() {
	return super.toString() + ":" + latitude + " " + longitude + " " + accuracy;
    }

    @Override
    public boolean equals(Object obj) {
	return super.equals(obj);
    }

    @Override
    public int hashCode() {
	return super.hashCode();
    }

    public double getLatitude() {
	return latitude;
    }

    public void setLatitude(double latitude) {
	this.latitude = latitude;
    }

    public double getLongitude() {
	return longitude;
    }

    public void setLongitude(double longitude) {
	this.longitude = longitude;
    }

    public double getAccuracy() {
	return accuracy;
    }

    public void setAccuracy(double accuracy) {
	this.accuracy = accuracy;
    }

    public Double getAltitude() {
	return altitude;
    }

    public void setAltitude(Double altitude) {
	this.altitude = altitude;
    }

    public double getAltitudeAccuracy() {
	return altitudeAccuracy;
    }

    public void setAltitudeAccuracy(Double altitudeAccuracy) {
	this.altitudeAccuracy = altitudeAccuracy;
    }

    public Double getHeading() {
	return heading;
    }

    public void setHeading(Double heading) {
	this.heading = heading;
    }

    public Double getSpeed() {
	return speed;
    }

    public void setSpeed(Double speed) {
	this.speed = speed;
    }

}
