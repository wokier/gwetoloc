package com.googlecode.gwetoloc.geo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.googlecode.gwetoloc.model.Position;

/**
 * Position callback, called after the user accepted to share its position
 * 
 */
public abstract class PositionCallback implements AsyncCallback<Position> {

    /**
     * <ul>
     * <li>PERMISSION_DENIED</li>
     * <li>POSITION_UNAVAILABLE</li>
     * <li>TIMEOUT</li>
     * </ul>
     * 
     */
    public class GeolocationFailedException extends RuntimeException {

	public GeolocationFailedException() {
	    super();
	}

	public GeolocationFailedException(String message) {
	    super(message);
	}

    }

    /**
     * @see com.google.gwt.user.client.rpc.AsyncCallback#onSuccess(java.lang.Object)
     */
    public abstract void onSuccess(Position position);

    protected void onError(int code, String message) {
	onFailure(new GeolocationFailedException(code + ":" + message));
    }

    /**
     * @see com.google.gwt.user.client.rpc.AsyncCallback#onFailure(java.lang.Throwable)
     */
    public void onFailure(Throwable caught) {
	GWT.getUncaughtExceptionHandler().onUncaughtException(caught);
    }
}