package com.googlecode.gwetoloc.geo;

/**
 * GWeToloc HTML5 geolocation<br>
 * 
 * @see <a href="http://www.w3.org/TR/geolocation-API/">W3C Geolocation API</a>
 * @see <a href="http://diveintohtml5.org/geolocation.html">Dive Into HTML5 -
 *      Geolocation</a>
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
			var opt = options.@com.googlecode.gwetoloc.geo.PositionOptions::toJso()();
			navigator.geolocation
					.getCurrentPosition(
							function(position) {
								var gwtCoordinates = @com.googlecode.gwetoloc.model.Coordinates::new(DDD)(position.coords.latitude, position.coords.longitude, position.coords.accuracy);
								var gwtPosition = @com.googlecode.gwetoloc.model.Position::new(Lcom/googlecode/gwetoloc/model/Coordinates;D)(gwtCoordinates,position.timestamp);
								callback.@com.googlecode.gwetoloc.geo.PositionCallback::onSuccess(Lcom/googlecode/gwetoloc/model/Position;)(gwtPosition);
							},
							function(error) {
								callback.@com.googlecode.gwetoloc.geo.PositionCallback::onError(ILjava/lang/String;)(error.code, error.message);
							}, opt);
			return true;
		} else {
			return false;
		}
    }-*/;

    private static native boolean getCurrentPositionGears(PositionCallback callback)/*-{

		return false;
    }-*/;

}
