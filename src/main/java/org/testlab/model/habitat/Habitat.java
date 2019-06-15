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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toshl
 */
public class Habitat {

    public enum SurfaceElement {
        SOIL,
        GRAVEL,
        SAND,
        BOULDERS,
        GRASSES,
        MOSSY_ROCKS
    };

    public enum PlantElement {
        ALPINE_FIR,
        BALD_CYPRESS,
        CEDAR,
        CHOLLA_CACTUS,
        DOUGLAS_FIR,
        FERN,
        HONEYSUCKLE,
        IRONWOOD,
        MAPLE,
        OAK,
        PALM_TREE,
        PRICKLY_PEAR,
        SASSAFRAS,
        YUCCA,
    };

    public enum AquaticElement {
        NONE,
        SPRING,
        CHANNEL,
        POOL
    };

    private SurfaceElement surface;

    private AquaticElement aquatic;

    private List<PlantElement> plants;
    
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SurfaceElement getSurfaceElement() {
        return surface;
    }

    public void setSurfaceElement(SurfaceElement surface) {
        this.surface = surface;
    }

    public List<PlantElement> getPlantElements() {
        if (plants == null) {
            plants = new ArrayList<>();
        }
        return plants;
    }

    public void setPlantElements(List<PlantElement> plants) {
        this.plants = plants;
    }
    
    public Habitat addPlantElement(PlantElement plant) {
        getPlantElements().add(plant);
        return this;
    }

    public AquaticElement getAquaticElement() {
        return aquatic;
    }

    public void setAquaticElement(AquaticElement aquatic) {
        this.aquatic = aquatic;
    }
    
    @Override
    public String toString() {
        return new StringBuilder()
                .append(description)
                .append(", ")
                .append("surface: ")
                .append(surface)
                .append(", aquatic: ")
                .append(aquatic)
                .append(", plants: ")
                .append(plants.toString())
                .toString();
    }
}
