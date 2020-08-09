package com.problemsolving.challenge_contests.mayChallenge.week1;

public class NumJewelsInStone {
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        char chararr[] = S.toCharArray();
        for (int i = 0; i < chararr.length; i++) {
            if (J.contains(String.valueOf(chararr[i]))) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }
}
