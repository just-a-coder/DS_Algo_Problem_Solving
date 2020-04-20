package com.problemsolving.geeksforgeeks;

public class RobotsMovingInCircle {
    public static void main(String[] args) {
        String pathString = "GLGLGLG";
        char path[] = pathString.toCharArray();
        findPathCircular(path);
    }

    private static void findPathCircular(char[] path) {
        int dir = 0;
        int x = 0, y= 0;

        for (int i = 0; i < path.length; i++) {
            char move = path[i];

            if (move == 'R') {
                dir = (dir+1)%4;
            } else if (move == 'L') {
                dir = (4 + dir - 1) % 4;
            } else {
                // If Move is "G"
                if (dir == 0) {
                    x++;
                } else if (dir == 1) {
                    y++;
                } else if (dir == 2) {
                    --x;
                } else { // if dir == 3
                    --y;
                }
            }
        }

        if ((x==0) && (y==0))
        System.out.println("Circular");
        else
        System.out.println("Not Circular");
    }


}
