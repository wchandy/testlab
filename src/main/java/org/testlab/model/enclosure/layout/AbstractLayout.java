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
import java.text.DecimalFormat;

/**
 *
 * @author toshl
 */
public abstract class AbstractLayout implements Layout {

    protected static DecimalFormat NUMBER_FORMAT = new DecimalFormat("###.##");

    private static final String SUMMARY = "%s - perimeter: %s ft, area: %s sq ft";

    @Override
    public String toString() {
        return String.format(SUMMARY, getClass().getSimpleName(), getPerimeter(), getArea());
    }
}
