package com.problemsolving.leetcode.challenge_contests.mayChallenge.week1_7th;

import java.util.HashMap;
import java.util.Map;

class FirstUniqueCharacter {
/*    public static int firstUniqChar(String s) {
        int slow = 0;
        if (s.length() == 0) return -1;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            if (arr[ch]++ >= 1) {
                while (slow < s.length() && arr[s.charAt(slow) - 'a'] > 1) {
                    slow++;
                }
            }
        }
        return (slow < s.length()) ? slow : -1;
    }*/

/*	public static int firstUniqChar(String s) {
		int res = Integer.MAX_VALUE;

		for(char c = 'a'; c <= 'z'; c++){
			int index = s.indexOf(c);

			if(index != -1 && index == s.lastIndexOf(c))
				res = Math.min(res, index);
		}

		if(res == Integer.MAX_VALUE)
			return -1;
		else
			return res;
	}*/

	public static int firstUniqChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			int firstIndex = s.indexOf(s.charAt(i));
			int lastIndex = s.lastIndexOf(s.charAt(i));
			if (firstIndex == lastIndex) {
				return firstIndex;
			}
		}
		return -1;
	}

    public static void main(String args[]) {
        String s = "aab";
        System.out.println(firstUniqChar(s));
    }
}