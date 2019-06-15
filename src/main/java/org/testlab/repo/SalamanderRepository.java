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
package org.testlab.repo;

import org.testlab.model.animal.Newt;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.testlab.common.LoggingObject;
import org.testlab.data.ZooCollections;

/**
 * Uses stream library throughout as an example of how to apply filter, map, etc.
 * 
 * @author toshl
 */
public class SalamanderRepository extends LoggingObject {

    /**
     * Returns all newts of the given species and sorts them into a list by ID.
     * Notes: sorted() calls Newt.compareIds(n1,n2)
     *
     * @param species
     */
    public void findBySpecies(Newt.SPECIES species) {
        getLog().info("Species: {}", species);
        List<Newt> list = ZooCollections.Newts.stream()
                .filter(n -> n.getSpecies()== species)
                .sorted(Newt::compareIds)
                .collect(Collectors.toList());
        list.forEach(n -> getLog().info(n.toString()));
    }

    /**
     * Returns the names of the newts of a given species and sorts them
     * alphabetically.
     *
     * Notes: map() calls Newt.getName() String.join concatenates and delimits
     * the list.
     *
     * @param species
     */
    public void findNames(Newt.SPECIES species) {
        getLog().info("Species: {}", species);
        List<String> names = ZooCollections.Newts.stream()
                .filter(n -> n.getSpecies() == species)
                .map(Newt::getName)
                .sorted()
                .collect(Collectors.toList());
        getLog().info(String.join(DELIMITER, names));
    }

    /**
     * Returns the IDs of the newts of a given species and sorts in ascending
     * order.
     *
     * @param species
     */
    public void findIds(Newt.SPECIES species) {
        getLog().info("Species: {}", species);
        List<Long> ids;
        ids = ZooCollections.Newts.stream()
                .filter(n -> n.getSpecies() == species)
                .map(Newt::getId)
                .sorted()
                .collect(Collectors.toList());

        getLog().info(concatLongs(ids));
    }

    /**
     * Returns the subset of newts that match the given newt list.
     *
     * @param list
     * @return
     */
    public List<Newt> match(List<Newt> list) {
        Set<Long> matchingIDs = ZooCollections.Newts.stream()
                .map(Newt::getId)
                .collect(Collectors.toSet());
        return matchById(matchingIDs);
    }

    /**
     * Returns the subset of newts that match the given ID list.
     *
     * @param ids
     * @return
     */
    public List<Newt> matchById(Set<Long> ids) {
        return ZooCollections.Newts.stream()
                .filter(n -> ids.contains(n.getId()))
                .collect(Collectors.toList());
    }

    /**
     * 
     * @param ids 
     */
    public void printMatchById(Set<Long> ids) {
        List<Newt> list = matchById(ids);
        list.forEach(n -> getLog().info(n.toString()));
    }

    /**
     * 
     */
    public void print() {
        List<String> names = Arrays.stream(Newt.SPECIES.values())
                .map(Newt.SPECIES::name)
                .collect(Collectors.toList());
        getLog().info(String.join(DELIMITER, names));
    }

    /**
     * Returns concatenated String from a list of IDs.
     *
     * @param list List of Long IDs.
     * @return
     */
    private String concatLongs(List<Long> list) {
        return list.stream()
                .map(l -> String.valueOf(l))
                .collect(Collectors.joining(DELIMITER));
    }

}
