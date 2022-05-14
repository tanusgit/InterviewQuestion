public int lastStoneWeight(int[] stones) {
        if (stones.length == 1){
            return stones[0];
        }
        //to get the max element from the queue when polling from the queue
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> b - a);
        //adding all the elements to the queue
        for (int val : stones){
            q.offer(val);
        } 
                
        while (q.size() > 1) {
            int first = q.poll();
            int second = q.poll();
            
            first -= second;
            
            if (first != 0) {
                q.offer(first);
            }
        }
        //both poll and peek works as we only need to return the remaining element
        //return q.size() > 0 ? q.poll() : 0;
        return q.size() > 0 ? q.peek() : 0;
    }
