class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alp = new int[26];
        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();
        for(char cs : char_s){
            alp[cs-'a']++;
        }

        for(char ct : char_t){
            alp[ct-'a']--;
        }

        int sum = 0;

        for(int i = 0; i < alp.length; i++){
            if(alp[i] != 0) return false;
        }

        return true;
    }
}
