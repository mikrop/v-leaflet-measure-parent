package org.vaadin.addon.leaflet.measure.client.control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * options: {
     position: 'topright',
     activeColor: '#ABE67E',     // base color for map features while actively measuring
     completedColor: '#C8F2BE',  // base color for permenant features generated from completed measure
     popupOptions: {             // standard leaflet popup options http://leafletjs.com/reference.html#popup-options
        className: 'leaflet-measure-resultpopup',
        autoPanPadding: [10, 10]
     }
 * }
 */
public class MeasureOptions extends JavaScriptObject {

    protected MeasureOptions() {}

    public static native MeasureOptions create()
	/*-{
        return {};
    }-*/;

    /**
     * Base color for map features while actively measuring.
     */
    public native final void setActiveColor(String activeColor)
	/*-{
        this.activeColor = activeColor;
    }-*/;

}
