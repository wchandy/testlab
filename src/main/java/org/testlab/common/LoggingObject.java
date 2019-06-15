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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author toshl
 */
public class LoggingObject {
    
    protected static final CharSequence DELIMITER = ", ";

    private static Logger logger;

    protected Logger getLog() {
        if (logger == null) {
            logger = LoggerFactory.getLogger(getClass().getSimpleName());
        }
        return logger;
    }
}
