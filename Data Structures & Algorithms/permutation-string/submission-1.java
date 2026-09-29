class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;

        int[] need = new int[26];
        int[] window = new int[26];
        for (int i = 0; i < n; i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (need[i] == window[i]) matches++;
        }

        for (int r = n; r < m; r++) {
            if (matches == 26) return true;

            int in = s2.charAt(r) - 'a';
            window[in]++;
            if (window[in] == need[in]) matches++;
            else if (window[in] == need[in] + 1) matches--;

            int out = s2.charAt(r - n) - 'a';
            window[out]--;
            if (window[out] == need[out]) matches++;
            else if (window[out] == need[out] - 1) matches--;
        }

        return matches == 26;
    }
}