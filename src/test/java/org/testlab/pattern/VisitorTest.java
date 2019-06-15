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
package org.testlab.pattern;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.testlab.common.visitor.Asset;
import org.testlab.common.visitor.CostPerWeekCalculator;
import org.testlab.model.animal.BigCat;
import org.testlab.model.animal.Newt;
import org.testlab.model.animal.Snake;
import org.testlab.test.TestCase;

/**
 * Visitor is a way to perform an operation on a diverse set of classes, which
 * here are called Assets. Each Asset implements a common interface that in turn
 * gives access to a method on the Visitor interface. The Asset provides a
 * simple abstract method to call on each class that implements more specific
 * method on the Visitor.
 *
 * In this example, the Visitor implements the interface Operator.java and the
 * visited items implement Asset.java. The method Asset.accept(Operator op)
 * provides the integration point.
 *
 * Also in this example, all the Assets share an abstract base class, Animal,
 * but this feature is not required. In fact, facilitating freedom from class
 * inheritance is really the strength of this pattern. Any class that implements
 * Asset.java can be included in the list operation.
 *
 * @author toshl
 */
public class VisitorTest extends TestCase {
    
    
    @Test
    public void runTest() {
 Newt newt = new Newt(Newt.SPECIES.AXOLOTL, "newton", 15L);
        newt.setCricketsPerDay(3);

        Snake snake = new Snake(Snake.SPECIES.MASSASAUGA_RATTLER, "massy", 175L);
        snake.setRatsPerWeek(2);

        BigCat cat = new BigCat(BigCat.SPECIES.JAGUAR, "jay", 275L);
        cat.setPoundsOfMeatPerDay(2);

        List<Asset> list = new ArrayList<>();
        list.add(newt);
        list.add(snake);
        list.add(cat);

        CostPerWeekCalculator calc = new CostPerWeekCalculator();

        list.forEach(a -> a.accept(calc));
        getLog().info("total cost per week: " + calc.getCostStr());
    }
}
