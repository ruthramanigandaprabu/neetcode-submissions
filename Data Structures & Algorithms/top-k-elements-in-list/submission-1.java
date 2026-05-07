class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> valuesVsCountMap = new HashMap<>();
        for(int num:nums){
            valuesVsCountMap.merge(num,1,Integer::sum);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap= new PriorityQueue<>(Map.Entry.comparingByValue());
           for(Map.Entry<Integer,Integer> entry: valuesVsCountMap.entrySet()){
               heap.offer(entry);
               if(heap.size()>k){
                   heap.poll();
               }
           }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll().getKey();
        }
        return result;  
    }
}
