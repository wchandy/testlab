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

import org.testlab.model.animal.BigCat;
import org.testlab.model.animal.Newt;
import org.testlab.model.animal.Snake;

/**
 *
 * @author toshl
 */
public interface Operator {
    
   void process(BigCat asset);
   
   void process(Newt news);
   
   void process(Snake snake);
}
