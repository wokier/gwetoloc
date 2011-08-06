package com.googlecode.gwetoloc.client;

import java.util.List;
import java.util.Set;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwetoloc.geo.NavigatorGeolocation;
import com.googlecode.gwetoloc.geo.PositionCallback;
import com.googlecode.gwetoloc.model.Position;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWeTolocEntryPoint implements EntryPoint, UncaughtExceptionHandler {

    /**
     * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
     */
    public void onModuleLoad() {
	GWT.setUncaughtExceptionHandler(this);
	Scheduler.get().scheduleDeferred(new Command() {
	    public void execute() {
		doModuleLoad();
	    }
	});
    }

    private void doModuleLoad() {

	Anchor anchor = new Anchor("GWeToloc");
	anchor.addClickHandler(new ClickHandler() {
	    public void onClick(ClickEvent event) {
		NavigatorGeolocation.getCurrentPosition(new PositionCallback() {
		    public void onSuccess(Position position) {
			Window.alert(position.getCoords().getLatitude() + " " + position.getCoords().getLongitude());
		    }
		});
	    }
	});
	RootPanel content = RootPanel.get("content");
	content.getElement().setInnerHTML("");
	content.add(anchor);
    }

    @Override
    public void onUncaughtException(Throwable e) {
	Window.alert(e.getClass().getName() + " " + e.getMessage());
	List<Throwable> throwables;
	if (e instanceof UmbrellaException) {
	    Set<Throwable> causes = ((UmbrellaException) e).getCauses();
	    Window.alert("Exceptions: " + causes);
	    GWT.log("onUncaughtExceptions " + causes);
	} else {
	    Window.alert("Exceptions: " + e);
	    GWT.log("onUncaughtException", e);
	}
    }
}
