package com.problemsolving.hackerrank.algo;

public class CatsAndMouse {
    public static void main(String[] args) {
        int x = 1, y = 3, z = 2;
        String result = catAndMouse(x, y, z);
        System.out.println(result);
    }

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int difWithFirst = Math.abs(z-x);
        int difWithSecond = Math.abs(z-y);

        if (difWithFirst < difWithSecond) {
            return "Cat A";
        } else if (difWithFirst > difWithSecond) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
}
