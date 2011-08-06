package com.googlecode.gwetoloc.model;

import java.io.Serializable;
import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * http://dev.w3.org/geo/api/spec-source.html#position
 * 
 * @author Francois 'wokier' Wauquier
 * 
 */
public class Position implements Serializable, IsSerializable {

    private static final long serialVersionUID = 1L;

    private Coordinates coords = new Coordinates();
    private Date timestamp;

    /**
     * Constructor
     */
    public Position() {
	super();
    }

    /**
     * Constructor with all fields
     * 
     * @param coords
     * @param timestamp
     */
    public Position(Coordinates coords, double timestamp) {
	super();
	this.coords = coords;
	this.timestamp = new Date(new Double(timestamp).longValue());
    }

    @Override
    public String toString() {
	return super.toString() + ":" + coords + " " + timestamp;
    }

    @Override
    public boolean equals(Object obj) {
	return super.equals(obj);
    }

    @Override
    public int hashCode() {
	return super.hashCode();
    }

    public Coordinates getCoords() {
	return coords;
    }

    public void setCoords(Coordinates coords) {
	this.coords = coords;
    }

    public Date getTimestamp() {
	return timestamp;
    }

    public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
    }

}
