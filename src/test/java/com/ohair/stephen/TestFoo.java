package com.ohair.stephen;

import org.junit.Assert;
import org.junit.Test;

/**
 * Example test class to demonstrate code coverage reports.
 * 
 * @author Stephen O'Hair
 *
 */
public class TestFoo {

    @Test
    public void testBaReturnsTrueGivenNonEmpty() {
        Foo f = new Foo();
        Assert.assertTrue(f.ba(1));
    }
    
    @Test
    public void testBaReturnsFalseGivenNull() {
        Foo f = new Foo();
        Assert.assertFalse(f.ba(0));
    }
    

}
