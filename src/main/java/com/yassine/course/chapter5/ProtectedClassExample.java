package com.yassine.course.chapter5;

public class ProtectedClassExample {

    public String name;

    protected class AnInnerClass {

        public void explain() {
            System.out.println("Protected keyword can be used only with" +
                    " an inner class (and not with a top-level class).");
        }
    }
}
