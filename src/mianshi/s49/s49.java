package mianshi.s49;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 拼凑钱币
 */
public class s49 {
    public static void main(String[]args) throws Exception
    {
        int[] money = {1,5,10 ,20,50,100} ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        int[][] d = new int[7][n + 1];
//        for(int i = 0 ; i <= 6 ; i++)
//        {
//            d[i][0] = 1 ;
//        }
//        for(int i = 1 ; i <= money.length ; i++)
//        {
//            for(int k = 0 ; k<= )
//        }
        long[] sum = new long[n+1];
        sum[0] = 1 ;
        for(int i = 0 ; i < money.length ; i++ )
        {
          for(int j = money[i] ; j <= n ; j++ ){
              sum[j] += sum[j - money[i]];
          }
        }
        System.out.println(sum[n]);
    }
}
