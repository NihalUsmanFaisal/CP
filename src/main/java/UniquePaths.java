public class UniquePaths {
    public int uniquePaths(int m, int n){
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = 1;
        return solution(dp,0,0);
    }

    private int solution(int[][] dp,int i,int j){
        if(dp[i][j] > 0){return dp[i][j];}
        dp[i][j] = (i < dp.length -1 ? solution(dp,i+1,j) : 0) + ( j < dp[0].length-1 ? solution(dp,i,j+1) : 0);
        return dp[i][j];
    }

}
