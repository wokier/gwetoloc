package com.googlecode.gwetoloc.geo;

import java.io.Serializable;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Additional options for receiving the user's location
 * http://dev.w3.org/geo/api/spec-source.html#position-options
 * 
 * @author Francois 'wokier' Wauquier
 * 
 */
public class PositionOptions implements Serializable, IsSerializable {

    private static final long serialVersionUID = 1L;

    private boolean enableHighAccuracy = false;
    private int timeout = -1;
    private int maximumAge = 0;

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

    public boolean getEnableHighAccuracy() {
	return enableHighAccuracy;
    }

    /**
     * Sets whether or not the application will request a more accurate position
     * from the browser.
     * 
     * <p>
     * If the browser supports this option, the user will be prompted to grant
     * permission to this application, even if permission to get the user's
     * (less accurate) position has already been granted.
     * </p>
     * 
     * <p>
     * Requesting high accuracy may be slower, or not supported at all,
     * depending on the browser.
     * </p>
     * 
     * <p>
     * By default this is <code>false</code>
     * 
     * @param enableHighAccuracy
     */
    public void setEnableHighAccuracy(boolean enableHighAccuracy) {
	this.enableHighAccuracy = enableHighAccuracy;
    }

    public int getTimeout() {
	return timeout;
    }

    /**
     * Sets the amount of time (in milliseconds) that the application is willing
     * to wait before getting the user's position. If a request for position
     * takes more than this amount of time, an error will result.
     * 
     * <p>
     * By default this is -1, which means there is no application-specified
     * timeout.
     * </p>
     * 
     * @param timeout
     */
    public void setTimeout(int timeout) {
	this.timeout = timeout;
    }

    public int getMaximumAge() {
	return maximumAge;
    }

    /**
     * Allows the browser to return a position immediately with a cached
     * position. The maximum age is then the oldest acceptable cached position.
     * If no acceptable cached position is found, the browser will locate the
     * user and cache and return the position.
     * 
     * <p>
     * By default this is 0, which means that the position cache will not be
     * used.
     * </p>
     * 
     * @param maximumAge
     */
    public void setMaximumAge(int maximumAge) {
	this.maximumAge = maximumAge;
    }

    protected native JavaScriptObject toJso() /*-{
		var opt = {};
		if (this) {
			opt.enableHighAccuracy = this.@com.googlecode.gwetoloc.geo.PositionOptions::enableHighAccuracy;
			opt.maximumAge = this.@com.googlecode.gwetoloc.geo.PositionOptions::maximumAge;

			if (this.@com.googlecode.gwetoloc.geo.PositionOptions::timeout > 0) {
				opt.timeout = this.@com.googlecode.gwetoloc.geo.PositionOptions::timeout;
			}
		}
		return opt;
    }-*/;

}
