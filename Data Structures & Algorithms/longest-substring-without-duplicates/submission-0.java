class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int windowEnd =0;
        int maxLength = 0;
        Map<Character,Integer> charToIndex  = new HashMap<>();
        while(windowEnd<s.length()){
            Character currentChar = s.charAt(windowEnd);
            if(charToIndex.containsKey(currentChar) && charToIndex.get(currentChar)>=windowStart){
                windowStart = charToIndex.get(currentChar)+1;
            }
            maxLength= Math.max(maxLength,windowEnd-windowStart+1);
            charToIndex.put(currentChar,windowEnd);
            windowEnd++;

        }
        return maxLength;
    }
}
