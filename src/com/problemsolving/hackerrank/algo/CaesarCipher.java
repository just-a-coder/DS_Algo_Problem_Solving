package com.problemsolving.hackerrank.algo;

public class CaesarCipher {
    public static void main(String[] args) {
        String str = "www.abc.xy";
        int k = 87;
        String encryptedMessage = caesarCipher(str, k);
        System.out.println(encryptedMessage);
    }

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String encrypted = "";
        k = k%26;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                char ch = (char) (arr[i] + k);
                int diff = ch - 122;
                if (diff > 0) {
                    ch = (char) (96 + diff);
                }
                encrypted = encrypted + ch;
            } else if (arr[i] >= 65 && arr[i] <= 90) {
                char ch = (char) (arr[i] + k);
                int diff = ch - 90;
                if (diff > 0) {
                    ch = (char) (64 + diff);
                }
                encrypted = encrypted + ch;
            } else {
                encrypted = encrypted + arr[i];
            }
        }
        return encrypted;
    }
}
