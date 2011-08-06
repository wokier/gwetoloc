package com.googlecode.gwetoloc.model;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * http://dev.w3.org/geo/api/spec-source.html#position-options
 * 
 * @author Francois 'wokier' Wauquier
 * 
 */
public class PositionOptions implements Serializable, IsSerializable {

    private static final long serialVersionUID = 1L;

    private Boolean enableHighAccuracy;
    private Long timeout;
    private Long maximumAge;

    /**
     * Constructor
     */
    public PositionOptions() {
	super();
    }

    @Override
    public String toString() {
	return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
	return super.equals(obj);
    }

    @Override
    public int hashCode() {
	return super.hashCode();
    }

    public Boolean getEnableHighAccuracy() {
	return enableHighAccuracy;
    }

    public void setEnableHighAccuracy(Boolean enableHighAccuracy) {
	this.enableHighAccuracy = enableHighAccuracy;
    }

    public Long getTimeout() {
	return timeout;
    }

    public void setTimeout(Long timeout) {
	this.timeout = timeout;
    }

    public Long getMaximumAge() {
	return maximumAge;
    }

    public void setMaximumAge(Long maximumAge) {
	this.maximumAge = maximumAge;
    }

}
