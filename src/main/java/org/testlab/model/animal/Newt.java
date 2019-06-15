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
public class Newt extends Animal {

    public enum SPECIES {
        AXOLOTL,
        FIRE_BELLY_NEWT,
        HELLBENDER,
        SWORD_TAIL_NEWT,
        REDTAILED_KNOBBY_NEWT
    }

    public Newt(SPECIES species, String name, Long id) {
        super(name);
        this.id = id;
        this.species = species;
    }

    private SPECIES species;
    
    private Integer cricketsPerDay;

    @Override
    public String getSpeciesStr() {
        return getSpecies().name();
    }

    public SPECIES getSpecies() {
        return species;
    }

    public void setSpecies(SPECIES species) {
        this.species = species;
    }

    public Integer getCricketsPerDay() {
        return cricketsPerDay;
    }

    public void setCricketsPerDay(Integer cricketsPerDay) {
        this.cricketsPerDay = cricketsPerDay;
    }

    @Override
    public void accept(Operator operator) {
        operator.process(this);
    }

}
