/*
 * Copyright 2019 Optimal Solutions, Inc.
 * 
 * This work is the exclusive property of Optimal Solutions, Inc.
 * Redistribution and use in source or binary forms without the
 * express consent of Optimal Solutions, Inc. is prohibited.
 * 
 * 
 * All rights reserved.
 */
package org.testlab.pattern;

import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.testlab.model.habitat.HabitatDirector;
import org.testlab.model.habitat.Habitat;
import org.testlab.test.TestCase;

/**
 * The builder pattern constructs various kinds or "flavors" of a single class.
 * Typically the builder class uses a type of "fluid" syntax to allow easy
 * construction.
 * The pattern can have various levels of complexity:
 * a) A simple builder where the client calls each property method.
 * b) An abstract builder where subclasses produce different versions.
 * c) A director pattern where a factory-style method is used to create
 * different versions.
 * 
 * In this example versions of Habitat (a class, not an interface) are produced
 * by calling HabitatDirector, which uses different builder subclasses to
 * produce habitats.
 *
 * @author toshl
 */
public class BuilderTest extends TestCase {
    
    @Test
    public void runDemo() {
        Habitat habitat;
        
        habitat = HabitatDirector.get(HabitatDirector.HabitatType.DESERT).build();
        getLog().info("Habitat: " + habitat.toString());
        
        habitat = HabitatDirector.get(HabitatDirector.HabitatType.SUBTROPICAL).build();
        getLog().info("Habitat: " + habitat.toString());
        assertTrue(true);
    }
}
