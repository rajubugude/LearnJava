public class GridsDp {
    public static void main(String[] args) {
        GridsDp obj = new GridsDp();

    }

    public  int uniquePaths(int m, int n) {
        // Write your code here.
        int [][] vis = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                vis[i][j] = -1;
            }
        }
        return 0;

    }
}
