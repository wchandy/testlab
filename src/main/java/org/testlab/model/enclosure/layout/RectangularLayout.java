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

import org.testlab.model.enclosure.Layout;

/**
 *
 * @author toshl
 */
public class RectangularLayout extends AbstractLayout implements Layout {
    
    private int width;
    
    private int length;

    public RectangularLayout() {
        //
    }

    public RectangularLayout(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) +  (2 * length);
    }
    
}
