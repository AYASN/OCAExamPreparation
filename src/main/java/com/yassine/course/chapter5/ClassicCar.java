package com.yassine.course.chapter5;

public class ClassicCar extends Car {

    public static void main(String[] args) {
        // Here we will call super() constructors implicitly,
        // Car() that in turn call Vehicle()
        new ClassicCar();
    }
}
