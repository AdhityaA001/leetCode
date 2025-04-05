package medium;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int lastIndex[] = new int[128];

        for(int start = 0, end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            start = Math.max(start, lastIndex[currentChar]);
            maxLength = Math.max(maxLength, end - start + 1);
            lastIndex[currentChar] = end + 1;
        }
        return maxLength;
    }

}
