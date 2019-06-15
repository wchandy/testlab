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
package org.testlab.model.habitat;

/**
 *
 * @author toshl
 */
public class TemperateRainforestBuilder extends HabitatBuilder {

    public TemperateRainforestBuilder() {
        this.description = "Temperate Rainforest";
    }

    @Override
    public HabitatBuilder withSurfaceElement() {
        getHabitat().setSurfaceElement(Habitat.SurfaceElement.MOSSY_ROCKS);
        return this;
    }

    @Override
    public HabitatBuilder withAquaticElement() {
        getHabitat().setAquaticElement(Habitat.AquaticElement.CHANNEL);
        return this;
    }

    @Override
    public HabitatBuilder withPlantElements() {
        getHabitat()
                .addPlantElement(Habitat.PlantElement.DOUGLAS_FIR)
                .addPlantElement(Habitat.PlantElement.ALPINE_FIR);
        return this;
    }
}
