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
package org.testlab.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.testlab.data.ZooCollections.SnakeCollection;
import org.testlab.model.animal.BigCat;
import org.testlab.model.animal.Newt;
import org.testlab.model.animal.Snake;

/**
 *
 * @author toshl
 */
public class ZooCollections {
    
    private ZooCollections() {
        //
    }

    static final Newt[] NewtCollection = {
        new Newt(Newt.SPECIES.AXOLOTL, "Joe", 75L),
        new Newt(Newt.SPECIES.FIRE_BELLY_NEWT, "Eli", 13L),
        new Newt(Newt.SPECIES.AXOLOTL, "Brandon", 25L),
        new Newt(Newt.SPECIES.SWORD_TAIL_NEWT, "Rebecca", 5L),
        new Newt(Newt.SPECIES.REDTAILED_KNOBBY_NEWT, "Margaret", 3L),
        new Newt(Newt.SPECIES.FIRE_BELLY_NEWT, "Dan", 121L),
        new Newt(Newt.SPECIES.AXOLOTL, "Matt", 54L),
        new Newt(Newt.SPECIES.FIRE_BELLY_NEWT, "Josh", 17L),
        new Newt(Newt.SPECIES.REDTAILED_KNOBBY_NEWT, "Chad", 33L),
        new Newt(Newt.SPECIES.AXOLOTL, "Scott", 12L),
        new Newt(Newt.SPECIES.REDTAILED_KNOBBY_NEWT, "Lee", 39L)
    };

    public static final List<Newt> Newts = new ArrayList<>(Arrays.asList(NewtCollection));

    static final Snake[] SnakeCollection = {
        new Snake(Snake.SPECIES.BLUE_RACER, "Spencer", 175L),
        new Snake(Snake.SPECIES.EASTERN_HOGNOSED, "Kristy", 113L),
        new Snake(Snake.SPECIES.EASTERN_MILK, "Josiah", 125L),
        new Snake(Snake.SPECIES.BLUE_RACER, "Jeff", 115L),
        new Snake(Snake.SPECIES.MASSASAUGA_RATTLER, "Rob", 113L),
        new Snake(Snake.SPECIES.EASTERN_MILK, "Josie", 105L)
    };

    public static final List<Snake> Snakes = new ArrayList<>(Arrays.asList(SnakeCollection));
    
    static final BigCat[] CatCollection = {
        new BigCat(BigCat.SPECIES.TIGER, "Roni", 275L),
        new BigCat(BigCat.SPECIES.LION, "Spencer", 213L),
        new BigCat(BigCat.SPECIES.LION, "Don", 225L)
    };
    
    public static final List<BigCat> BigCats = new ArrayList<>(Arrays.asList(CatCollection));


}
