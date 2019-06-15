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
public class BigCat extends Animal {

    public BigCat(String name) {
        super(name);
    }
    
    public BigCat(BigCat.SPECIES species, String name, Long id) {
        super(name);
        this.species = species;
        this.id = id;
    }

    public enum SPECIES {
        TIGER,
        LION,
        LEOPARD,
        JAGUAR
    }

    private SPECIES species;
    
    private double poundsOfMeatPerDay;

    public SPECIES getSpecies() {
        return species;
    }

    public void setSpecies(SPECIES species) {
        this.species = species;
    }
    
    @Override
    public String getSpeciesStr() {
        return getSpecies().toString();
    }

    public double getPoundsOfMeatPerDay() {
        return poundsOfMeatPerDay;
    }

    public void setPoundsOfMeatPerDay(double poundsOfMeatPerDay) {
        this.poundsOfMeatPerDay = poundsOfMeatPerDay;
    }
    
    public void accept(Operator operator) {
        operator.process(this);
    }
    
}
