package com.yassine.questions.question29;

public class Caller {
    public static void main(String[] args) {
        Secret secret = new MySecret();
        check((e) -> {String f = ""; return "Poof";});
    }

    private static void check(Secret secret) {
            System.out.println("Result: " + secret.mag(7));
    }
}


//A, F