package org.vaadin.addon.leaflet.measure;

import org.vaadin.addon.leaflet.control.AbstractDefaultControl;
import org.vaadin.addon.leaflet.measure.client.LeafletMeasureServerRpc;

public class LMeasure extends AbstractDefaultControl {

    public LMeasure() {
        registerRpc(new LeafletMeasureServerRpc() {

            @Override
            public void setPlocha(int plocha) {
                System.out.println("Plocha: " + plocha);
            }

        });
    }

//    @Override
//    protected LeafletMeasureState getState() {
//        return (LeafletMeasureState) super.getState();
//    }
//
//    @OnStateChange("area")
//    void areaChange() {
//        String area = getState().area;
//        throw new IllegalStateException(area);
//    }

}
