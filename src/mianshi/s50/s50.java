package mianshi.s50;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 美团 最大差值
 */
public class s50 {

    public static int getDis(int[] A, int n) {
        int minNumber = A[0];
        int res = 0;

        for (int i = 1; i < n; i++) {
            if (A[i] - minNumber > res) {
                res = A[i] - minNumber;
            }
            if (A[i] < minNumber) {
                minNumber = A[i];
            }
        }
        return 0 ;
    }
}


