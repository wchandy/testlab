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
package org.testlab.pattern;

import org.junit.Test;
import org.testlab.common.LoggingObject;
import org.testlab.model.enclosure.AbstractEnclosureFactory;
import org.testlab.model.enclosure.Enclosure;
import org.testlab.model.enclosure.EnclosureFactory;
import org.testlab.model.enclosure.layout.RectangularLayout;

/**
 *
 * @author toshl
 */
public class AbstractFactoryTest extends LoggingObject {
    
    @Test
    public void runTest() {
        RectangularLayout rectangularLayout = new RectangularLayout(50, 75);
        EnclosureFactory factory = AbstractEnclosureFactory.get(AbstractEnclosureFactory.EnclosureType.INDOOR);
        Enclosure enclosure = factory.create(rectangularLayout, Enclosure.Barrier.CHAIN_LINK);
        enclosure.setId(501L);
        getLog().info("Enclosure: " + enclosure.toString());
    }
}
