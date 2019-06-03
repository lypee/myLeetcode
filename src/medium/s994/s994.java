package medium.s994;

import java.util.LinkedList;
import java.util.Queue;

public class s994 {
    public static void main(String[]args)
    {
            int[][] a = {{2,1,1} , {1,1,0} , {0,1,1}} ;
            int[][] b = {{2,1,1} ,{0,1,1} , {1,0,1}} ;
            int[][] c = {{0,2}} ;
            int[][] d = {{1}} ;
                System.out.println(orangesRotting(d));
    }
    public static int orangesRotting(int[][] grid)
    {
        if(grid.length == 0 || grid == null)
        {
            return 0 ;
        }
        if(grid.length == 1 && grid[0][0] == 0)
        {
            return 0 ;
        }
        //rows
        int n = grid.length ;
        //cols
        int m = grid[0].length ;
        Queue<int[]> queue = new LinkedList<>() ;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 2)
                {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int count  = 0 ;
        int[][] dirs = {{-1  , 0 } , {1 , 0} , {0 , -1} ,{0 , 1}} ;
        while(!queue.isEmpty())
        {
            ++count;
            for(int i = 0 ; i < queue.size() ; i++) {
                int[] cell = queue.poll();
                for(int[] d:dirs)
                {
                    int  r = cell[0] + d[0] ;
                    int c = cell[1] + d[1];
                    if(r < 0 || r >= n || c < 0 || c >= m || grid[r][c]== 0 ||grid[r][c] ==2 )
                    {
                        continue;
                    }

                    grid[r][c] = 2 ;
                    queue.offer(new int[]{r,c}) ;

                }
            }


        }


        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j ++)
            {
                if(grid[i][j] == 1)
                {
                    return -1 ;
                }
            }
        }
        return count-1 ;
    }
}
