package com.problemsolving.challenge_contests.mayChallenge.week2;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // If original color is same as new color then nothing to do, simply return
        if(image[sr][sc] == newColor)
            return image;

        fill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }

    private void fill(int[][] image, int row, int column, int originalColor, int newColor) {
        // Checking edge cases for row and column
        if(row<0 || row >= image.length || column<0 || column>= image[0].length)
            return;

        // If current cell color is not the original color, then no need to change this
        if(image[row][column] != originalColor)
            return;

        image[row][column] = newColor;

        // Moving up
        fill(image,row-1,column,originalColor,newColor);
        // Moving Down
        fill(image,row+1,column,originalColor,newColor);
        // Moving Left
        fill(image,row,column-1,originalColor,newColor);
        // Moving Right
        fill(image,row,column+1,originalColor,newColor);
    }
}
