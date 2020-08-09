package com.problemsolving.challenge_contests.mayChallenge.week2;

/**
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 * Slope Formula: (y2-y1)/(x2-x1)
 */
public class CheckIfStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length <= 2) return true;
        double slope = (double)(coordinates[1][1]- coordinates[0][1])
                /(coordinates[1][0]-coordinates[0][0]);
        for (int i = 1; i < coordinates.length-1; i++) {
            double checkSlope = (double)(coordinates[i+1][1]- coordinates[i][1])
                    /(coordinates[i+1][0]-coordinates[i][0]);

            if(checkSlope != slope )
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int mat[][] = new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(mat));
    }
}
