package org.vaadin.addon.leaflet.measure.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletMeasureClientBundle extends ClientBundle {

    @Source("leaflet-measure.js")
    @DoNotEmbed
    TextResource script();

    @Source("leaflet-measure.css")
    @CssResource.NotStrict
    CssResource css();

}
