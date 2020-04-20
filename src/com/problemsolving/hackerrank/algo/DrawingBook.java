package com.problemsolving.hackerrank.algo;

public class DrawingBook {

    public static void main(String[] args) {
        int n = 6, k = 4;
        int pageTurnCount = pageCount(n, k);
        System.out.println(pageTurnCount);
    }


    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int k) {
        int pageTurnFromFront = 0, pageTurnFromBack = 0;
        pageTurnFromFront = k/2;
        if (n % 2 == 0) {
            pageTurnFromBack = (n-k+1)/2;
        } else {
            pageTurnFromBack = (n-k)/2;
        }
        if(pageTurnFromBack<pageTurnFromFront)
            return pageTurnFromBack;
        else
            return pageTurnFromFront;
    }
}
