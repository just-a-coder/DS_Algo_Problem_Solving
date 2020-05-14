package com.problemsolving.leetcode.array.easy;

public class IslandPerimeter_463 {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int leftNeighbour = 0, upNeighBour = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        upNeighBour++;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        leftNeighbour++;
                    }
                }
            }
        }

        return 4 * count - 2 * upNeighBour - 2 * leftNeighbour;
    }
}
