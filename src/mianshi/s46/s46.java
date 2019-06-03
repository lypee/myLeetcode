package mianshi.s46;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s46 {
    public static int res = 0 ;
    public static int[] money = {1, 5, 10, 20, 50, 100};
    public static void main(String[]args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
            dfs(n);
            System.out.println(res);
    }
    public static void  dfs(int n)
    {
        if(n == 0)
        {
            res++ ;
            return ;
        }
        if(n < 0 )
        {
            return ;
        }

        for(int i = 0;  i< 6 ; i++)
        {
            dfs(n - money[i]);
        }
    }
}
