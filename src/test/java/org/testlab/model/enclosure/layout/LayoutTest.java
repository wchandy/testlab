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
package org.testlab.model.enclosure.layout;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.testlab.test.TestCase;

/**
 *
 * @author toshl
 */
public class LayoutTest extends TestCase {
    
    @Test
    public void runTest() {
        RectangularLayout layout = new RectangularLayout();
        layout.setWidth(50);
        layout.setLength(100);
        getLog().info("layout: " + layout.toString());
        
        assertEquals(300.0, layout.getPerimeter());
        assertEquals(5000.0, layout.getArea());
    }
    
}
