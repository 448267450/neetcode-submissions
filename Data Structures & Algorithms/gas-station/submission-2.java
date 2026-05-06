class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0, costTotal = 0;

        for(int i = 0; i < gas.length; i++){
            gasTotal += gas[i];
        }

        for(int j = 0; j < gas.length; j++){
            costTotal += cost[j];
        }

        if(gasTotal < costTotal) return -1;

        int total = 0, res = 0;

        for(int k = 0; k < gas.length; k++){
            total += gas[k] - cost[k];

            if(total < 0){
                total = 0;
                res = k + 1;
            }
        }

        return res;
    }
}
