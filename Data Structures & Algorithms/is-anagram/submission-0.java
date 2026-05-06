class Solution {
    public boolean isAnagram(String s, String t) {
        int[] dict = new int[26];

        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        for(char sc: s_array ){
            dict[sc-'a']++;
        } 

        for(char tc: t_array){
            if(dict[tc-'a'] != 0){
                dict[tc-'a']--;
            } else {
                dict[tc-'a']++;
            }
            
        }

        int sum = Arrays.stream(dict).sum();

        return sum == 0;
    }
}
