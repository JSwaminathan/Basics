package com.jaa.ds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StackTest 
{
    
    @Test
    public void checkStack()
    {
    	Stack stack = new Stack();
    	stack.push(10);
    	int value = stack.pop();
    	
        assertEquals(10, value);
    }

    @Test
    public void checkEmptyStack()
    {
    	Stack stack = new Stack();
    	stack.push(10);
    	int value = stack.pop();
    	
        assertEquals(10, value);
        try {
        	// should trigger runtime exception
        	stack.pop();
        	assertFalse(false);
        	
        } catch (RuntimeException re) {
        	// Expected as no additional item present!
        	System.out.println("Expected as no additional item present!");
        }

    }
}
