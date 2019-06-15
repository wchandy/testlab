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

/**
 *
 * @author toshl
 */
public class OutdoorEnclosure extends Enclosure {

    public enum ShelterArrangment {
        COVERING,
        OUTBUILDING,
        HOUSING
    }

    public OutdoorEnclosure() {
        //
    }
    
    public OutdoorEnclosure(Layout layout) {
        super(layout);
    }
    
    private ShelterArrangment shelter;

    public ShelterArrangment getShelterArrangment() {
        return shelter;
    }

    public void setShelterArrangment(ShelterArrangment shelter) {
        this.shelter = shelter;
    }

}
