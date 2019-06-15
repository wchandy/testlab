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
import static org.testlab.model.enclosure.layout.AbstractLayout.NUMBER_FORMAT;

/**
 *
 * @author toshl
 */
public class CircularLayout extends AbstractLayout implements Layout {
    
    private int diameter;

    public CircularLayout() {
        
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        double radius = diameter/2;
        double area =  Math.PI * radius * radius;
        return Double.valueOf(NUMBER_FORMAT.format(area));
        
    }

    @Override
    public double getPerimeter() {
        double radius = diameter/2;
        double perimeter = 2 * Math.PI * radius;
        return Double.valueOf(NUMBER_FORMAT.format(perimeter));
    }
    
}
