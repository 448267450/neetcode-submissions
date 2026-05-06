class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // 1. 初始化：所有 rotten 入队 + 统计 fresh
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // 如果一开始没有 fresh，直接返回 0
        if (fresh == 0) return 0;

        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int minutes = 0;

        // 2. BFS 扩散
        while (!q.isEmpty()) {
            int size = q.size();
            boolean changed = false;

            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];

                for (int[] d : dirs) {
                    int nx = x + d[0];
                    int ny = y + d[1];

                    // 边界检查
                    if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;

                    // 只有 fresh 才能变 rotten
                    if (grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        fresh--;
                        q.offer(new int[]{nx, ny});
                        changed = true;
                    }
                }
            }

            // 只有真正扩散了，才算 1 分钟
            if (changed) minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
