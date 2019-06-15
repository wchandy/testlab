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
import org.testlab.model.enclosure.IndoorEnclosure;
import org.testlab.model.enclosure.Layout;

/**
 *
 * @author toshl
 */
public class IndoorEnclosureFactory implements EnclosureFactory {

    @Override
    public Enclosure create(Layout layout, Enclosure.Barrier barrier) {
        IndoorEnclosure enclosure = new IndoorEnclosure(layout);
        enclosure.setBarrier(barrier);
        return enclosure;
    }
    
}
