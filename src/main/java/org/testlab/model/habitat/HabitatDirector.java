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
package org.testlab.model.habitat;

/**
 *
 * @author toshl
 */
public class HabitatDirector {

    public enum HabitatType {
        DESERT,
        GRASSLAND,
        WOODLAND,
        TEMPERATE_RAINFOREST,
        SUBTROPICAL
    }
    
    private HabitatDirector() {
        //
    }

    public static HabitatBuilder get(HabitatType type) {
        switch (type) {
            case DESERT:
                return new DesertBuilder();
            case TEMPERATE_RAINFOREST:
                return new TemperateRainforestBuilder();
            case WOODLAND:
                return new WoodlandBuilder();
            case SUBTROPICAL:
                return new SubTropicalBuilder();
            case GRASSLAND:
                return new GrasslandBuilder();
            default:
                return null;
        }
    }

}
