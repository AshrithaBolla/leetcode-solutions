class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int maxLength=0;
        int[] freq=new int[256];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]++;
            while(freq[s.charAt(right)]>2){
                freq[s.charAt(left)]--;
                left++;
            }
            int currLength=right-left+1;
            maxLength=Math.max(maxLength,currLength);
        }
        return maxLength;
    }
}