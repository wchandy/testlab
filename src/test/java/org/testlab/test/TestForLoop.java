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
package org.testlab.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author toshl
 */
public class TestForLoop {

    private static final List<Integer> list = new ArrayList<>();
    private static long startTime;
    private static long endTime;
    private static long elapsed1;
    private static long elapsed2;
    private static long elapsed3;
    private static long elapsed4;
    private static long elapsed5;

    static {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    @Test
    public void runTest() {
        int loop = 0;
        int totalLoops = 5;
        Integer x = 1;

        while (loop < totalLoops) {
            loop++;


            //Type 3
            startTime = Calendar.getInstance().getTimeInMillis();
            Iterator<Integer> item = list.iterator();
            while (item.hasNext()) {
                print(item.next());
            }
            endTime = Calendar.getInstance().getTimeInMillis();
            elapsed3 = (endTime - startTime);
            System.out.println("");

            //Type 4
            startTime = Calendar.getInstance().getTimeInMillis();
            list.forEach((n) -> print(n));
            endTime = Calendar.getInstance().getTimeInMillis();
            elapsed4 = (endTime - startTime);
            System.out.println("");

            //Type 5
            startTime = Calendar.getInstance().getTimeInMillis();
            list.forEach((n) -> {
                integer.print(n);
            });
            endTime = Calendar.getInstance().getTimeInMillis();
            elapsed5 = (endTime - startTime);
            System.out.println("");
            
            //Type 2
            startTime = Calendar.getInstance().getTimeInMillis();
            for (int j = 0; j < list.size(); j++) {
                print(list.get(j));
            }
            endTime = Calendar.getInstance().getTimeInMillis();
            elapsed2 = (endTime - startTime);
            System.out.println("");

            
            //Type 1
            startTime = Calendar.getInstance().getTimeInMillis();
            for (Integer num : list) {
                print(num);
            }
            endTime = Calendar.getInstance().getTimeInMillis();
            elapsed1 = (endTime - startTime);
            System.out.println("");

            //TOTALS
            int count = 1;
            System.out.println("\nLoop #" + loop);
            System.out.println(count++ + ") " + elapsed1 + "ms = for (Integer num : list){ print(num); }");
            System.out.println(count++ + ") " + elapsed2 + "ms = for (int j = 0; j < list.size(); j++){ print(list.get(j)); }");
            System.out.println(count++ + ") " + elapsed3 + "ms = while (item.hasNext()){ print(item.next()); }");
            System.out.println(count++ + ") " + elapsed4 + "ms = list.forEach((n) -> print(n)); ");
            System.out.println(count++ + ") " + elapsed5 + "ms = list.forEach((n) -> { integer.print(n); }); ");
        }

    }

    public interface Function<T> {

        void print(T t);
    }

    Function<Integer> integer = ((n) -> {
        System.out.println(n);
    });

    private void print(Integer x) {
        System.out.println(x);
    }
}
