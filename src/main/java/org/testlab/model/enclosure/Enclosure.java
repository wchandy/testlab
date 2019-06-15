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
package org.testlab.model.enclosure;

import org.testlab.common.Model;

/**
 *
 * @author toshl
 */
public class Enclosure extends Model {

    public enum Barrier {
        WIRE_MESH,
        CHAIN_LINK,
        GLASS,
        MOAT,
        UNDEFINED
    }

    private Barrier barrier = Barrier.UNDEFINED;

    /**
     * Bridge Pattern: Layout is the implementation interface part of the
     * pattern.
     */
    private Layout layout;

    public Enclosure() {
        //
    }

    public Enclosure(Layout layout) {
        this.layout = layout;
    }

    public Barrier getBarrier() {
        return barrier;
    }

    public void setBarrier(Barrier barrier) {
        this.barrier = barrier;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Double getArea() {
        if (getLayout() == null) {
            return Double.MIN_VALUE;
        }
        return getLayout().getArea();
    }

    public Double getPerimeter() {
        if (getLayout() == null) {
            return Double.MIN_VALUE;
        }
        return getLayout().getPerimeter();
    }

    public String getLayoutStr() {
        if (getLayout() == null) {
            return "undefined";
        }
        return getLayout().toString();
    }

    private static final String SUMMARY = ", barrier: %s, layout: %s";

    @Override
    public String toString() {
        return super.toString()
                + String.format(SUMMARY, barrier.toString(), getLayout().toString());
    }
}
