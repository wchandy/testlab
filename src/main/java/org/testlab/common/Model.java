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
package org.testlab.common;

import org.testlab.model.animal.Animal;

/**
 *
 * @author toshl
 */
public class Model {

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdStr() {
        if (id == null) {
            return "undefined";
        }
        return id.toString();
    }

    public static int compareIds(Animal n1, Animal n2) {
        return n1.getId().compareTo(n2.getId());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - id: " + getIdStr();
    }

}
