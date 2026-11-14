class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // 存下标,对应的值单调递减

        for (int i = 0; i < n; i++) {
            // 1. 队头下标已经滑出窗口,弹出
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2. 队尾元素比当前元素小,永远不可能是最大值,弹出
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3. 当前下标入队
            dq.offerLast(i);

            // 4. 窗口形成后,队头就是当前窗口最大值
            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}