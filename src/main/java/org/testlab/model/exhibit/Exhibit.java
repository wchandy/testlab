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
package org.testlab.model.exhibit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testlab.model.animal.Animal;
import org.testlab.model.enclosure.Enclosure;
import org.testlab.model.habitat.Habitat;

/**
 *
 * @author toshl
 */
public class Exhibit {

    private List<Animal> animals;
    private Enclosure enclosure;
    private Habitat habitat;

    public List<Animal> getAnimals() {
        if (animals == null) {
            animals = new ArrayList<>();
        }
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        getAnimals().add(animal);
    }

    public void removeAnimal(Long id) {
        Iterator<Animal> list = getAnimals().iterator();
        while (list.hasNext()) {
            if (id.equals(list.next().getId())) {
                list.remove();
                break;
            }
        }
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

}
