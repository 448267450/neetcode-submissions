class Solution {

    Queue<int[]> range = new LinkedList<>();
    int prev = 0, curr = 0;
    public String encode(List<String> strs) {
        String res = "";
        for(String s : strs){
            curr += s.length();
            range.add(new int[]{prev, curr});
            res += s;
            prev = curr;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> split = new ArrayList<>();
        while(!range.isEmpty()){
            int[] index = range.poll();
            split.add(str.substring(index[0], index[1]));
        }
        return split;
    }
}
