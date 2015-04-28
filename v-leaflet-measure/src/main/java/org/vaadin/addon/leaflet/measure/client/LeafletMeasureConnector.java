package org.vaadin.addon.leaflet.measure.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import org.vaadin.addon.leaflet.measure.LMeasure;
import org.vaadin.addon.leaflet.measure.client.control.Measure;
import org.vaadin.addon.leaflet.measure.client.control.MeasureOptions;

@Connect(LMeasure.class)
public class LeafletMeasureConnector extends AbstractDefaultControl {

    @Override
    public LeafletMeasureState getState() {
        return (LeafletMeasureState) super.getState();
    }

    @Override
    protected Measure createControl() {
        MeasureOptions options = MeasureOptions.create();
        Measure control = Measure.create(options);
        getMap().addControl(control);
        return control;
    }

    @Override
    protected Measure getControl() {
        return (Measure) super.getControl();
    }

}