class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        char[] filter = sb.toString().toCharArray();

        int left = 0, right = filter.length - 1;

        while(left <= right){
            if(filter[left] != filter[right]){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
