package mianshi.s47;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s47 {
    public static void main(String[]args) throws Exception
    {
//        int[] A = {2,1,5,6,2,3} ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split("\\s");
        int[] A= new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            A[i] = Integer.parseInt(strings[i]);
        }
        int[] length = new int[A.length];
        for(int i =0 ; i  < A.length ; i++)
        {
            int res = 1 ;
            int index = i ;

            while(index >= 0)
            {
                if(index == 0 )
                {
                    break ;
                }
                if(A[i] <= A[index -1]) {
                    index-- ;
                    res++ ;
                }else{
                    break ;
                }
            }
            index = i;
            while(index < A.length)
            {
                if(index == A.length -1)
                {
                    break ;
                }
                if(A[i] <= A[index+1])
                {
                    index++ ;
                    res++ ;
                }else
                {
                    break ;
                }
            }
            length[i] = res ;
        }
        int ans = 0 ;
        for(int i = 0 ; i < A.length ; i++)
        {
            ans = Math.max(ans, A[i] * length[i]);
        }
        System.out.println(ans);
    }

}
