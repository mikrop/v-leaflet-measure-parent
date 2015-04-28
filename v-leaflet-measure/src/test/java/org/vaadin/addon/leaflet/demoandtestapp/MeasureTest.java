package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.demoandtestapp.util.AbstractTest;
import org.vaadin.addon.leaflet.measure.LMeasure;
import org.vaadin.addon.leaflet.shared.ControlPosition;

public class MeasureTest extends AbstractTest {

    @Override
    public String getDescription() {
        return "Test measure control";
    }

    private LMap leafletMap;

    @Override
    public Component getTestComponent() {
        leafletMap = new LMap();
        leafletMap.setCenter(60.4525, 22.301);
        leafletMap.setZoomLevel(15);
        leafletMap.addBaseLayer(new LOpenStreetMapLayer(), "OSM");

        LMeasure measure = new LMeasure();
        measure.setPosition(ControlPosition.topright);
//        measure.setEnabled(false);

        leafletMap.addControl(measure);

        return leafletMap;
    }

    @Override
    protected void setup() {
        super.setup();
    }

}
