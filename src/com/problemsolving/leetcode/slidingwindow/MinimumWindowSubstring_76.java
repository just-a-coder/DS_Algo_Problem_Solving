package com.problemsolving.leetcode.slidingwindow;

public class MinimumWindowSubstring_76 {
    public String minWindow(String s, String t) {
        int tarr[] = new int[128];
        String mincountstr = s;
        boolean foundflag = false;

        if(t.length() >s.length())
        return "";

        for (int i = 0; i < t.length(); i++) {
            tarr[t.charAt(i)]++;
        }

        int sarr[] = new int[128];
        String wcountstr = "";
        for (int i = 0, start = 0; i < s.length(); i++) {
            /**
             * Move i pointer from left to right, Add string and check
             * it matches with calculated array tarr from t
             */
            ++sarr[s.charAt(i)];
            wcountstr = wcountstr + s.charAt(i);

            // Increase sarr array until it matches tarr
            while (matches(tarr, sarr)) {
                // Check current window length is less than mincount length
                if (mincountstr.length() >= wcountstr.length()) {
                    mincountstr = wcountstr;
                    foundflag = true;
                }

                /** Move Start flag from left to right and reduce wcount string as well from beginning.
                * After every removal check still condition is valid or not. Continue till it
                * is not valid
                 **/
                --sarr[s.charAt(start++)];
                wcountstr = wcountstr.substring(1, wcountstr.length());
            }
        }

        if(!foundflag) return "";
        else
        return mincountstr;
    }

    public boolean matches(int tarr[], int sarr[]) {
        for (int i = 0; i < tarr.length; i++) {
            if (tarr[i] > 0 && tarr[i] > sarr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ac";
        MinimumWindowSubstring_76 ob = new MinimumWindowSubstring_76();
        System.out.println(ob.minWindow(s,t));
    }
}
