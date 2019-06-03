package medium.s695;

import java.util.ArrayList;
import java.util.List;

public class s695 {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[]args) {
        int[][] a = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        System.out.println(maxArea(a));
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        int[][] dir = {{0,0,1,-1},{1,-1,0,0}};
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[i].length;j++){
                List<Integer> iList = new ArrayList<>(),jList = new ArrayList<>();
                if(grid[i][j] != 1) continue;
                int count = 1;
                grid[i][j] = 2;
                iList.add(i);jList.add(j);
                while(!iList.isEmpty()){
                    List<Integer> nextiList = new ArrayList<>(),nextjList = new ArrayList<>();
                    for(int k = 0; k< iList.size();k++){
                        for(int m = 0;m<dir[0].length;m++){
                            int y = iList.get(k) + dir[0][m],x = jList.get(k) + dir[1][m];
                            if(y>=0 && y< grid.length && x >= 0 && x < grid[0].length && grid[y][x] == 1){
                                grid[y][x] = 2;
                                count++;
                                nextiList.add(y);
                                nextjList.add(x);
                            }
                        }
                    }
                    iList = nextiList;
                    jList = nextjList;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }

    static int tempArea = 0 ;
    public static int maxArea(int[][] grid)
    {
        int maxArea = 0 ;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[i].length ; j++)
            {
                if(grid[i][j] == 1)
                {
                    tempArea = 0 ;
                    dfs(grid , i , j) ;
                    maxArea = Math.max(maxArea, tempArea);
                }
            }
        }
        return maxArea ;
    }
    public static void dfs(int[][] grid , int i , int j)
    {
        grid[i][j] = 0 ;
        tempArea ++ ;
        grid[i][j] = 0 ;
        tempArea ++ ;
        if( i > 0&&grid[i-1][j] == 1)
        {
            dfs(grid , i-1 , j) ;
        }
        if( i <grid.length -1&& grid[i+1][j] == 1)
        {
            dfs(grid, i + 1, j);
        }
        if( j < grid.length-1  && grid[i][j+1] == 1)
        {
            dfs(grid, i, j + 1);
        }
        if(j > 0 && grid[i][j-1] == 1)
        {
            dfs(grid, i, j - 1);
        }

    }
}
