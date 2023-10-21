package week5;

public class FloodFill_733 {

    public static void main(String[] args) {
        FloodFill_733 a = new FloodFill_733();
        int[][] image  = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        a.floodFill(image, sr, sc, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originColor = image[sr][sc];
        if(originColor != color) {
            dfs(image, sr, sc, originColor, color);
        }
        return  image;
    }
    void dfs(int[][] image, int sr, int sc, int originColor, int newColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originColor){
            return ;
        }
        image[sr][sc] = newColor;
        dfs(image, sr, sc+1, originColor, newColor);
        dfs(image, sr, sc-1, originColor, newColor);
        dfs(image, sr+1, sc, originColor, newColor);
        dfs(image, sr-1, sc, originColor, newColor);

    }
}
