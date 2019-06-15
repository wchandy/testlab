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
public abstract class HabitatBuilder {
    
    protected String description;

    private final Habitat habitat = new Habitat();

    protected Habitat getHabitat() {
        return habitat;
    }

    public Habitat build() {
        return withSurfaceElement()
                .withAquaticElement()
                .withPlantElements()
                .withDescription()
                .getHabitat();
    }
    
    protected HabitatBuilder withDescription() {
        getHabitat().setDescription(description);
        return this;
    }

    protected abstract HabitatBuilder withSurfaceElement();

    protected abstract HabitatBuilder withAquaticElement();

    protected abstract HabitatBuilder withPlantElements();

}
