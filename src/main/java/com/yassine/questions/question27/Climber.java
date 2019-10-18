package com.yassine.questions.question27;

public class Climber {
    public static void main(String[] args) {
        //compile error in this line
        check((h,l) -> h > l, 11);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}


// Q28 : A,D,F
// Q29