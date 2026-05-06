class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        PriorityQueue<Double> pq = new PriorityQueue<>();
        double result = 0.0, left = 0.0, right = 0.0;

        if(m>0){
            for(int num1 : nums1){
                pq.add(num1*1.0);
            }
        }

        if(n>0){
            for(int num2 : nums2){
                pq.add(num2*1.0);
            }
        }

        if((m+n)%2 != 0){
            for(int i = 0; i<=(m+n)/2; i++){
                if(i == (m+n)/2 && !pq.isEmpty()) result = pq.poll();
                if(!pq.isEmpty()) pq.poll();
            }
        }

        if((m+n)%2 == 0){
            for(int i = 0; i<=(m+n)/2; i++){
                if(i == (m+n)/2 - 1 && !pq.isEmpty()){
                    left = pq.poll();
                } else if(i == (m+n)/2 && !pq.isEmpty()){
                    right = pq.poll();
                    result = (left +right)/2;
                }  else{
                    if(!pq.isEmpty()) pq.poll();
                }
            }
        }
    return result;

    }
}
