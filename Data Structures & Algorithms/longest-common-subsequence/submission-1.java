class Solution {
    private int[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();

        memo = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                memo[i][j] = -1;
            }
        }

        return dfs(text1, text2, 0, 0);
    }

    private int dfs(String text1, String text2, int i, int j){
        if(i == text1.length() || j == text2.length()) return 0;

        if(memo[i][j] != -1) return memo[i][j];

        if(text1.charAt(i) == text2.charAt(j)){
            memo[i][j] = dfs(text1, text2, i+1, j+1) + 1;
        } else {
            memo[i][j] = Math.max(dfs(text1, text2, i+1, j),
            dfs(text1, text2, i, j+1));
        }

        return memo[i][j];
    }
}
