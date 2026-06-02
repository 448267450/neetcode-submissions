class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0, m = word1.length();
        int right = 0, n = word2.length();

        StringBuilder sb = new StringBuilder();
        if(m >= n){
            for(int i = 0; i < n; i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for(int i = n; i < m; i++){
                sb.append(word1.charAt(i));
            }
        } else {
            for(int i = 0; i < m; i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for(int i = m; i < n; i++){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}