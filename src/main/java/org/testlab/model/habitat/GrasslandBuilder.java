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
public class GrasslandBuilder extends HabitatBuilder {

    public GrasslandBuilder() {
        this.description = "Grassland";
    }

    @Override
    public HabitatBuilder withSurfaceElement() {
        getHabitat().setSurfaceElement(Habitat.SurfaceElement.GRASSES);
        return this;
    }

    @Override
    public HabitatBuilder withAquaticElement() {
        getHabitat().setAquaticElement(Habitat.AquaticElement.SPRING);
        return this;
    }

    @Override
    public HabitatBuilder withPlantElements() {
        return this;
    }

}
