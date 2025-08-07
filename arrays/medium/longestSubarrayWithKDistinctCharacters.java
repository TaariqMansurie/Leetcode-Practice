
public class longestSubarrayWithKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k){
        int maxLen = Integer.MIN_VALUE;
        int currLen = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        int freqHash[] = new int[26];
        int uniqueCharCount = 0;

        //iteration
        while(windowEnd < n){
            int index = s.charAt(windowEnd) - 97;
            if(freqHash[index] == 0){
                uniqueCharCount ++;
            }
            freqHash[index]++;

            if(uniqueCharCount == k){
                currLen = windowEnd - windowStart + 1;
                maxLen = Math.max(maxLen,currLen);
            }
            else if(uniqueCharCount > k){
                while(windowStart < windowEnd && uniqueCharCount > k){
                    index = s.charAt(windowStart) - 97;
                    freqHash[index] -- ;
                    windowStart ++;
                    if(freqHash[index] == 0){
                        uniqueCharCount -- ;
                    }
                }
            }
            windowEnd++;
        }

        return (maxLen == Integer.MIN_VALUE) ? -1 : maxLen;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(lengthOfLongestSubstringKDistinct(s,k));
    }
}
