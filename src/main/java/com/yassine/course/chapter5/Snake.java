package com.yassine.course.chapter5;

public class Snake extends Reptile {

    /*These methods in the child class do not throw a checked exception that is new or
      broader than the class of any exception thrown in the parent class method.
      So, they do not violate the rule of handling exceptions when overriding
      a parent method.
    */

    protected boolean hasLegs() {
        return false;
    }

    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
}
