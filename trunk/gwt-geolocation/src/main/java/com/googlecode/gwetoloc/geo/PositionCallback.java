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
     * @see com.google.gwt.user.client.rpc.AsyncCallback#onSuccess(java.lang.Object)
     */
    public abstract void onSuccess(Position position);

    /**
     * @see com.google.gwt.user.client.rpc.AsyncCallback#onFailure(java.lang.Throwable)
     */
    public void onFailure(Throwable caught) {
	GWT.getUncaughtExceptionHandler().onUncaughtException(caught);
    }
}