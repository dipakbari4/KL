package com.lxmindustries;

public class Shapes {
    public void triangle(int limit) {
        int i;
        int j;

        for (i = 1; i <= limit; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
