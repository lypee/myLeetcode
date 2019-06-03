package mianshi.s48;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s48 {
    public static void main(String[]args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        int n1 = s1.length();
        int n2 = s2.length() ;
        int[][] a = new int[n2][n1] ;
        int res = 0 ;
        for(int i = 0 ; i < n2 ; i++)
        {
            for(int j = 0 ; j < n1 ; j ++)
            {
                if (i == 0 && s1.charAt(j) == s2.charAt(i)) {
                    a[i][j] = 1 ;
                    res = Math.max(res , a[i][j]);

                }
                else if (j == 0 && s1.charAt(j) == s2.charAt(i)) {
                    a[i][j] = 1 ;
                    res = Math.max(res , a[i][j]);
                }
                else{
                    if(i == 0 || j == 0 )
                    {
                        continue;
                    }
                    if(s1.charAt(j) == s2.charAt(i)) {
                        a[i][j] = a[i - 1][j - 1] + 1;
                        res = Math.max(res , a[i][j]) ;
                    }
                }
            }
        }
            System.out.println(res);
    }
}
