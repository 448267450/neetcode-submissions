class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int l = 0, r = s1.length();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        String base = new String(c1);

        while(r <= s2.length()){
            String temp = s2.substring(l, r);
            char[] tp = temp.toCharArray();
            Arrays.sort(tp);
            String concat = new String(tp);
            if(!concat.equals(base)){
               l++;
               r++;
               continue;
            }
            return true;
        }

        return false;
    }
}
