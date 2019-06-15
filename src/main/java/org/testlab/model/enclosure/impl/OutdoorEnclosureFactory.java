/*
 * Copyright 2019 Optimal Solutions, Inc.
 * 
 * This work is the exclusive property of Optimal Solutions, Inc.
 * Redistribution and use in source or binary forms without the
 * express consent of Optimal Solutions, Inc. is prohibited.
 * 
 * 
 * All rights reserved.
 */
package org.testlab.model.enclosure.impl;

import org.testlab.model.enclosure.Enclosure;
import org.testlab.model.enclosure.EnclosureFactory;
import org.testlab.model.enclosure.Layout;
import org.testlab.model.enclosure.OutdoorEnclosure;

/**
 *
 * @author toshl
 */
public class OutdoorEnclosureFactory implements EnclosureFactory {

    @Override
    public Enclosure create(Layout layout, Enclosure.Barrier barrier) {
        OutdoorEnclosure enclosure = new OutdoorEnclosure(layout);
        enclosure.setBarrier(Enclosure.Barrier.CHAIN_LINK);
        return enclosure;
    }

}
