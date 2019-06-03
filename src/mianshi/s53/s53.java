package mianshi.s53 ;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class s53
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] ts=br.readLine().split(" ");
        int n=Integer.parseInt(ts[0]),m=Integer.parseInt(ts[1]);
        int len=n*m;
        int[] a=new int[len];
        int index=0;
        for(int i=0;i<n;i++)
        {
            ts=br.readLine().split(" ");
            for(int j=0;j<m;j++)
            {
                a[index]=Integer.parseInt(ts[j]);
                index++;
            }
        }
        int maxn=100005;
        int[] book1=new int[maxn];
        int[] book2=new int[maxn];
        for(int i=0;i<len;i+=2) book1[a[i]]++;
        for(int i=1;i<len;i+=2) book2[a[i]]++;
        int min=999999;

        boolean f=false;
        for(int i=0;i<maxn;i++)
        {
            if(book1[i]!=0&&book2[i]!=0)
            {
                if(Math.abs(book1[i]-book2[i])<min)
                {
                    if(book1[i]>book2[i])f=true;
                    else f=false;
                    min=Math.abs(book1[i]-book2[i]);
                }
            }
        }
        int ans=len/2-min;
        System.out.println(f?ans+1:ans);
    }

}
