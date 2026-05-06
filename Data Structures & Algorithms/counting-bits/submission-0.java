class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0; i <= n; i++){
            res[i] = cntOne(i);
        }

        return res;
    }

    private int cntOne(int num){
        int count = 0;
        while(num != 0){
            count += (num & 1) == 0 ? 0 : 1;
            num >>= 1;
        }

        return count;
    }
}
