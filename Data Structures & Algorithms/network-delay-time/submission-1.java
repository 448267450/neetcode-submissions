class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n];
        int INFI = Integer.MAX_VALUE;
        Arrays.fill(dist, INFI);
        dist[k-1] = 0;

        for(int i = 0; i < n - 1; i++){
            for(int[] time : times){
                int u = time[0] - 1, v = time[1] - 1, w = time[2];
                if(dist[u] != INFI && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }

        int maxDist = Arrays.stream(dist).max().getAsInt();
        return maxDist == Integer.MAX_VALUE ? -1 : maxDist;
    }
}
