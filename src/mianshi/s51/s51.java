package mianshi.s51;

/**
 * 美团 棋子翻转
 */
public class s51 {
    public static void main(String[] args)
    {
        int[][] A ={{0,0,1,1},{1,0,1,0},{0,1,1,0} ,{0,0,1,0}};
        int[][] f = {{2,2},{3,3},{4,4}} ;
        int[][] K = flipChess(A, f);
        System.out.println();
    }
    public static int[][] flipChess(int[][] A , int[][] f)
    {
        for(int i = 0 ; i < f.length ; i++)
        {
            flip(A , f[i][0]-1 , f[i][1]-1);
        }
        return A ;
    }
    public static void flip(int[][] A , int x , int y )
    {
        if( x - 1 >= 0 )
        {
            A[x-1][y] = 1-A[x-1][y] ;
        }
        if(x + 1 <= A.length -1 )
        {
            A[x + 1][y] = 1 - A[x + 1][y];
        }
        if(y -1 >=  0 )
        {
            A[x][y-1] = 1 - A[x][y-1] ;
        }
        if(y+1 <= A.length -1 ) {
            A[x][y +1] = 1 - A[x][y +1];
        }
    }
}
