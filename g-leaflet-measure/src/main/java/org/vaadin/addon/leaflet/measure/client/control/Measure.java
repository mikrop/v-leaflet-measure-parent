package org.vaadin.addon.leaflet.measure.client.control;

import org.peimari.gleaflet.client.control.Control;
import org.vaadin.addon.leaflet.measure.client.resources.LeafletMeasureResourceInjector;

public class Measure extends Control {

	static {
        LeafletMeasureResourceInjector.ensureInjected();
	}

	protected Measure() {}

    public static native Measure create(MeasureOptions options)
	/*-{
        return new $wnd.L.Control.Measure(options);
	}-*/;

}
