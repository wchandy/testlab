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
package org.testlab.model.enclosure;

import org.testlab.model.enclosure.impl.IndoorEnclosureFactory;
import org.testlab.model.enclosure.impl.OutdoorEnclosureFactory;

/**
 *
 * @author toshl
 */
public class AbstractEnclosureFactory {
    
    public enum EnclosureType {
        INDOOR,
        OUTDOOR
    }
    
    private AbstractEnclosureFactory() {
        //
    }
    
    public static EnclosureFactory get(EnclosureType type) {
        switch(type){
            case INDOOR:
                return new IndoorEnclosureFactory();
            case OUTDOOR:
                return new OutdoorEnclosureFactory();
            default:
                return null;
        }
    }
    
}
