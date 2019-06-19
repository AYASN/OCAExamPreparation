package com.yassine.course;

public class OverloadOrder {
    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }

    public void fly(Long l) {
        System.out.print("long ");
    }

    public static void main(String[] args) {
        OverloadOrder r = new OverloadOrder();
        r.fly("test");
        r.fly(56);
    }
}