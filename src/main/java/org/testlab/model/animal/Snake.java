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
package org.testlab.model.animal;

import org.testlab.common.visitor.Operator;

/**
 *
 * @author toshl
 */
public class Snake extends Animal {
    
    public enum SPECIES {
        EASTERN_MILK,
        GREEN,
        EASTERN_HOGNOSED,
        NORTHERN_RING_NECKED,
        BLUE_RACER,
        MASSASAUGA_RATTLER
    }

    private SPECIES species;
    
    private Integer ratsPerWeek;
    
    public Snake(SPECIES species, String name, Long id) {
        super(name);
        this.id = id;
        this.species = species;
    }

    @Override
    public String getSpeciesStr() {
        return getSpecies().name();
    }

    public SPECIES getSpecies() {
        return species;
    }

    public void set(SPECIES species) {
        this.species = species;
    }

    public Integer getRatsPerWeek() {
        return ratsPerWeek;
    }

    public void setRatsPerWeek(Integer ratsPerWeek) {
        this.ratsPerWeek = ratsPerWeek;
    }

    @Override
    public void accept(Operator operator) {
        operator.process(this);
    }
    
    
}
