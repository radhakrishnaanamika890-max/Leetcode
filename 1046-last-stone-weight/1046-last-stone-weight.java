class Solution {
    public int lastStoneWeight(int[] s) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:s)
            pq.offer(num);
            while(pq.size()>1){
                int a=pq.poll();
                int b=pq.poll();
                if(a!=b){
                    pq  .offer(a-b);
                }
            }
            return (pq.size()==0)?0:pq.peek();
    }
}