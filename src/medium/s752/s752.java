package medium.s752;

import java.util.*;

public class s752 {
    public static void main(String[]args)
    {

    }
    public int openLock(String[] deadends , String target)
    {
        Set<String> vis = new HashSet();    //读取deadends，add进哈希集合
        for(String str : deadends)
            vis.add(str);

        if(vis.contains("0000")) return -1; //判断0000

        vis.add("0000");                    //哈希集合记录已经遍历过的
        Queue<String> queue = new ArrayDeque();
        queue.offer("0000");                //通过队列分别进行BFS
        int[] way = {-1,1};
        int sum = 0;

        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                String now = queue.poll();
                if(now.equals(target))
                    return sum;

                for(int j = 0; j < 4; j++)
                    for(int k = 0; k < 2; k++)
                    {
                        char[] c = now.toCharArray();
                        int digit = (c[j] - '0' + way[k] + 10) % 10;
                        c[j] = (char) ('0' + digit);
                        String nxt = new String(c);
                        if(!vis.contains(nxt))
                        {
                            vis.add(nxt);
                            queue.offer(nxt);
                        }
                    }
            }
            sum++;
        }
        return -1;
    }

    }




