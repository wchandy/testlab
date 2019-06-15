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
public class SubTropicalBuilder extends HabitatBuilder {

    public SubTropicalBuilder() {
        this.description = "Subtropical Savanna";
    }

    @Override
    public HabitatBuilder withSurfaceElement() {
        getHabitat().setSurfaceElement(Habitat.SurfaceElement.SAND);
        return this;
    }

    @Override
    public HabitatBuilder withAquaticElement() {
        getHabitat().setAquaticElement(Habitat.AquaticElement.POOL);
        return this;
    }

    @Override
    public HabitatBuilder withPlantElements() {
        getHabitat()
                .addPlantElement(Habitat.PlantElement.PALM_TREE)
                .addPlantElement(Habitat.PlantElement.BALD_CYPRESS);
        return this;
    }

}
