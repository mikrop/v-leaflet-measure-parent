package org.vaadin.addon.leaflet.measure.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import org.vaadin.addon.leaflet.measure.LMeasure;
import org.vaadin.addon.leaflet.measure.client.control.Measure;
import org.vaadin.addon.leaflet.measure.client.control.MeasureOptions;

@Connect(LMeasure.class)
public class LeafletMeasureConnector extends AbstractDefaultControl {

//    /**
//     * Třída pro komunikaci z klientské stránky na server.
//     */
//    private final LeafletMeasureServerRpc rpc = RpcProxy.create(LeafletMeasureServerRpc.class, this);

    @Override
    public LeafletMeasureState getState() {
        return (LeafletMeasureState) super.getState();
    }

    @Override
    protected Measure createControl() {
        MeasureOptions options = MeasureOptions.create();
//        options.setActiveColor("#000000");
        Measure control = Measure.create(options);
        getMap().addControl(control);
        return control;
    }

    @Override
    protected Measure getControl() {
        return (Measure) super.getControl();
    }

//    private void plocha(int plocha) {
//        rpc.setPlocha(plocha);
//    }
//
//    public native void attachClickHandler(com.google.gwt.dom.client.Element el)
//    /*-{
//        var self = this;
//        el.onclick = $entry(function(plocha) {
//            self.@org.vaadin.addon.leaflet.measure.client.LeafletMeasureConnector::plocha(I)(plocha);
//        });
//    }-*/;

}