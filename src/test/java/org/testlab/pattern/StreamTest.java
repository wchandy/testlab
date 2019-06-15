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

import java.util.Arrays;
import java.util.HashSet;
import org.junit.Test;
import org.testlab.model.animal.Newt;
import org.testlab.repo.SalamanderRepository;
import org.testlab.test.TestCase;

/**
 *
 * @author toshl
 */
public class StreamTest extends TestCase {

    @Test
    public void runTest() {
        SalamanderRepository repo = new SalamanderRepository();
        repo.print();
        getLog().info("-------------------------------------------");
        getLog().info("findBySpecies:");
        repo.findBySpecies(Newt.SPECIES.AXOLOTL);

        getLog().info("-------------------------------------------");
        getLog().info("findNames:");
        repo.findNames(Newt.SPECIES.AXOLOTL);

        getLog().info("-------------------------------------------");
        getLog().info("findIds:");
        repo.findIds(Newt.SPECIES.AXOLOTL);

        getLog().info("-------------------------------------------");
        getLog().info("printMatchById:");
        repo.printMatchById(new HashSet<>(Arrays.asList(1L, 5L, 12L, 13L, 39L)));
    }
}
