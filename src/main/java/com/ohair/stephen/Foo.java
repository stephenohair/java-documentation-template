package com.ohair.stephen;

/**
 * Example class to demonstrate javadoc generation.
 * 
 * @author Stephen O'Hair
 *
 */
public final class Foo {

    /**
     * Example method
     * 
     * @param s
     * @return true if s is not null or empty
     */
    public boolean ba(int i) {
        // silly condition block to demonstrate branch coverage reporting
        return i == 1 ? true : false;
    }

}
