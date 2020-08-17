package com.problemsolving.challenge_contests.contests;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

class HackerEarth_IO_Template {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs = Integer.parseInt(br.readLine());
        System.out.println(inputs);
        int arr[] = new int[inputs];
        String inputString[] = br.readLine().split(" ");
        for(String str: inputString){
            System.out.print(str+" ");
        }
    }
}
