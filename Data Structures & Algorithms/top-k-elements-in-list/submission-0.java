class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> valuesVsCountMap = new HashMap<>();
        for(int num:nums){
            int val = valuesVsCountMap.getOrDefault(num,0);
            valuesVsCountMap.put(num,val+1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(valuesVsCountMap.entrySet());
        entryList.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }
        return result;   
    }
}
