class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArr = s.toCharArray();
        // if(charArr.length == 1) return 1;
        int maxLen = 0;
        for(int i = 0; i<charArr.length; i++){
           Set<Character> seen = new HashSet<>();
           int len = 0;
           for(int j=i; j<charArr.length; j++){
            if(!seen.contains(charArr[j])){
               len++;
               seen.add(charArr[j]);
               maxLen = Math.max(maxLen, len);
            } else {
                break;
            }
           }
        }
        return maxLen;
    }
}
