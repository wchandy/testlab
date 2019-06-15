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

import org.testlab.common.Model;
import org.testlab.common.visitor.Asset;

/**
 *
 * @author toshl
 */
public abstract class Animal extends Model implements Asset {
    
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    
    public abstract String getSpeciesStr();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return getSpeciesStr() + ", " + name + ", " + getId().toString();
    }
    
}
