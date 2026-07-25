class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        char[] charArr = s.toCharArray();
        int n = charArr.length;
        int left = 0, right = 0;
        
        while (right < n) {
            if (!set.contains(charArr[right])) {
                set.add(charArr[right]);
                right++;
                max = Math.max(max, set.size()); // 每次成功扩张窗口都更新 max
            } else {
                set.remove(charArr[left]); // 只删掉最左边这一个字符
                left++;                     // 循环体外层会重新判断 charArr[right] 是否还在 set 里
            }
        }
        
        return max;
    }
}