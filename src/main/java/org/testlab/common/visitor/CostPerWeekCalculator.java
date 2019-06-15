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
package org.testlab.common.visitor;

import java.text.NumberFormat;
import org.testlab.common.LoggingObject;
import org.testlab.model.animal.BigCat;
import org.testlab.model.animal.Newt;
import org.testlab.model.animal.Snake;

/**
 * VISITOR PATTERN IMPLEMENTATION
 *
 * @author toshl
 */
public class CostPerWeekCalculator extends LoggingObject implements Operator {

    public enum Price {
        CRICKET(5),
        RAT(150),
        BEEF(500);

        private final Integer unitCost;

        Price(Integer unitCost) {
            this.unitCost = unitCost;
        }

        public Integer getUnitCost() {
            return unitCost;
        }
    }

    private static final NumberFormat formatter = NumberFormat.getCurrencyInstance();

    private Double weeklyCost = 0d;

    public Double getWeeklyCost() {
        double currency = weeklyCost;
        return currency / 100;
    }

    public String getCostStr() {
        double currency = getWeeklyCost();
        return formatter.format(currency);
    }

    @Override
    public void process(BigCat cat) {
        getLog().info("processing {}", cat.getSpeciesStr());
        double poundsPerDay = cat.getPoundsOfMeatPerDay();
        double costPerDay = poundsPerDay * Price.BEEF.getUnitCost();
        double costPerWeek = findCostPerWeek(costPerDay);
        getLog().info("cost per week: {}", formatter.format(costPerWeek/100));
        addCostPerWeek(costPerWeek);
    }

    @Override
    public void process(Newt newt) {
        getLog().info("processing {}", newt.getSpeciesStr());
        int cricketsPerDay = newt.getCricketsPerDay();
        double costPerDay = cricketsPerDay * Price.CRICKET.getUnitCost();
        double costPerWeek = findCostPerWeek(costPerDay);
        getLog().info("cost per week: {}", formatter.format(costPerWeek/100));
        addCostPerWeek(costPerWeek);
    }

    @Override
    public void process(Snake snake) {
        getLog().info("processing {}", snake.getSpeciesStr());
        int ratsPerWeek = snake.getRatsPerWeek();
        int costPerWeek = ratsPerWeek * Price.RAT.getUnitCost();
        getLog().info("cost per week: {}", formatter.format(costPerWeek/100));
        addCostPerWeek(costPerWeek);
    }

    private double findCostPerWeek(double costPerDay) {
        return (costPerDay * 7);
    }

    private void addCostPerWeek(double costPerWeek) {
        weeklyCost = weeklyCost + costPerWeek;
    }

}
