/*
 * Copyright 2018 Optimal Solutions, Inc.
 * 
 * This work is the exclusive property of Optimal Solutions, Inc.
 * Redistribution and use in source or binary forms without the
 * express consent of Optimal Solutions, Inc. is prohibited.
 * 
 * 
 * All rights reserved.
 */
package org.testlab.pattern;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.testlab.model.enclosure.Enclosure;
import org.testlab.model.enclosure.IndoorEnclosure;
import org.testlab.model.enclosure.OutdoorEnclosure;
import org.testlab.model.enclosure.layout.CircularLayout;
import org.testlab.model.enclosure.layout.RectangularLayout;
import org.testlab.test.TestCase;

/**
 * The bridge pattern decouples a class from the implementation of particular
 * properties. The basic components of the pattern include an Abstract class and
 * an Interface. The interface allows different behavior/characteristics to be
 * swapped easily into refinements of the Abstract class.
 *
 * In this example, Enclosure is the abstraction and Layout is the interface. The
 * sub-classes of Enclosure include IndoorEnclosure and OutdoorEnclosure. Here the
 * bridge pattern allows the subclasses to have different layouts without creating
 * additional sub-classes, such as CircularOutdoorEnclosure,
 * RectangularOutdoorEnclosure, etc.  The desired layout can easily be injected
 * into either class.
 *
 * Note that the barrier property could also be handled with a bridge.
 *
 * @author toshl
 */
public class BridgeTest extends TestCase {
    
    @Test
    public void runTest() {
        List<Enclosure> enclosures = new ArrayList<>();

        RectangularLayout rectangularLayout = new RectangularLayout(50, 75);
        
        IndoorEnclosure glassDisplay = new IndoorEnclosure(rectangularLayout);
        glassDisplay.setId(100L);
        glassDisplay.setBarrier(Enclosure.Barrier.GLASS);
        enclosures.add(glassDisplay);

        CircularLayout circularLayout = new CircularLayout();
        circularLayout.setDiameter(75);
        
        OutdoorEnclosure circularPen = new OutdoorEnclosure(circularLayout);
        circularPen.setId(101L);
        circularPen.setBarrier(Enclosure.Barrier.CHAIN_LINK);
        enclosures.add(circularPen);

        getLog().info("Enclosures: ");
        enclosures.forEach(e -> getLog().info(e.toString()));
    }
}
