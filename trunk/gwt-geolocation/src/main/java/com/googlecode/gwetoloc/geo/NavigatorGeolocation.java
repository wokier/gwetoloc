package com.googlecode.gwetoloc.geo;

import com.googlecode.gwetoloc.model.PositionOptions;

/**
 * GWeToloc<br>
 * http://dev.w3.org/geo/api/spec-source.html#introduction
 * 
 * @author Francois 'wokier' Wauquier
 */
public class NavigatorGeolocation {

    /**
     * The browser does not support geoloc
     */
    public static class UnsupportedGeolocalisationOperationException extends UnsupportedOperationException {

    }

    /**
     * get user current position
     * 
     * @param callback
     */
    public static void getCurrentPosition(PositionCallback callback) {
	getCurrentPosition(callback, new PositionOptions());
    }

    /**
     * get user current position with advanced options
     * 
     * @param callback
     * @param options
     */
    public static void getCurrentPosition(PositionCallback callback, PositionOptions options) {
	if (!getCurrentPositionHtml5(callback, options)) {
	    if (!getCurrentPositionGears(callback)) {
		throw new UnsupportedGeolocalisationOperationException();
	    }
	}
    }

    private static native boolean getCurrentPositionHtml5(PositionCallback callback, PositionOptions options)/*-{

													     if (navigator.geolocation) {
													     navigator.geolocation.getCurrentPosition(function(position){
													     var gwtCoordinates = @com.googlecode.gwetoloc.model.Coordinates::new(DDD)(position.coords.latitude, position.coords.longitude, position.coords.accuracy);
													     var gwtPosition = @com.googlecode.gwetoloc.model.Position::new(Lcom/googlecode/gwetoloc/model/Coordinates;D)(gwtCoordinates,position.timestamp);
													     callback.@com.googlecode.gwetoloc.geo.PositionCallback::onSuccess(Lcom/googlecode/gwetoloc/model/Position;)(gwtPosition);
													     });
													     return true;
													     }else{
													     return false;
													     }
													     }-*/;

    private static native boolean getCurrentPositionGears(PositionCallback callback)/*-{

										    return false;
										    }-*/;

}
