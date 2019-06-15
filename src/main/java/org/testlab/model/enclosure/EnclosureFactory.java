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
package org.testlab.model.enclosure;

import org.testlab.model.enclosure.Enclosure.Barrier;

/**
 *
 * @author toshl
 */
public interface EnclosureFactory {
        
    Enclosure create(Layout layout, Barrier barrier);
    
}
