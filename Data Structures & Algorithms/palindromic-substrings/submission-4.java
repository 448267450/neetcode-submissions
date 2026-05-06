class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] seen = new boolean[n][n];
        int cnt = 0;

        char[] c = s.toCharArray();

        for(int i = n - 1; i >= 0; i--){
            for(int j = i; j < n; j++){
                if((j - i <= 2 && !seen[i][j]) || seen[i+1][j-1]){
                    if(c[i] == c[j]){
                        cnt++;
                        seen[i][j] = true;
                    }
                    
                }
            }
        }

        return cnt;
    }
}
