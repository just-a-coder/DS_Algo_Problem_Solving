package com.problemsolving.hackerrank.algo.easy;

public class LibraryFine {
    public static void main(String[] args) {
        int d1 = 9, m1 = 6, y1 = 2015;
        int d2 = 6, m2 = 6, y2 = 2015;
        int fine = libraryFine(d1,m1,y1,d2,m2,y2);
        System.out.println(fine);
    }

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 10000;
        } else if(y2>y1){
            return 0;
        }


        if (m1 > m2) {
            return 500 * (m1-m2);
        } else if (m2>m1) {
            return 0;
        }

        if (d1 > d2) {
            return 15 * (d1 - d2);
        } else {
            return 0;
        }

    }
}
