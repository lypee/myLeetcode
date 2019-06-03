package easy.s733;

public class s733 {
    public static void main(String[] args)
    {
//        int[][] A = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] B ={{0,0,0},{0,1,1}};
        int sr =1 ;
        int sc = 1 ;
        int newColor = 1 ;

        floodFill(B, sr, sc, newColor);
    }
    public static int[][] floodFill(int[][] image , int sr , int sc , int newColor)
    {
        int number = image[sr][sc] ;
        dfs(image , sr , sc ,number ,newColor);
        return image ;
    }
    public static void dfs(int[][] image , int sr , int sc ,int number , int newColor)
    {
        if(sr >= image.length || sr < 0 || sc >= image[0].length  || sc  < 0 || image[sr][sc] != number || image[sr][sc] == newColor)
        {
            return ;
        }
        else{
            image[sr][sc] = newColor ;
            dfs(image, sr + 1,sc, number, newColor);
            dfs(image, sr - 1, sc,number, newColor);
            dfs(image, sr , sc + 1, number,newColor);
            dfs(image, sr , sc -  1, number,newColor);
            image[sr][sc] = newColor ;
        }
    }
}
