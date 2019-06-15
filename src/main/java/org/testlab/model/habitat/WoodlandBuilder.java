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
public class WoodlandBuilder extends HabitatBuilder {

    public WoodlandBuilder() {
        this.description = "Deciduous Woodland";
    }

    @Override
    public HabitatBuilder withSurfaceElement() {
        getHabitat().setSurfaceElement(Habitat.SurfaceElement.SOIL);
        return this;
    }

    @Override
    public HabitatBuilder withAquaticElement() {
        getHabitat().setAquaticElement(Habitat.AquaticElement.SPRING);
        return this;
    }

    @Override
    public HabitatBuilder withPlantElements() {
        getHabitat()
                .addPlantElement(Habitat.PlantElement.HONEYSUCKLE)
                .addPlantElement(Habitat.PlantElement.SASSAFRAS)
                .addPlantElement(Habitat.PlantElement.MAPLE)
                .addPlantElement(Habitat.PlantElement.OAK);
        return this;
    }
}
