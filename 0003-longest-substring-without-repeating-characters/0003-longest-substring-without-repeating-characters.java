import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map and its index is inside the current window
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }

            // Update the last seen index of the character
            charIndexMap.put(currentChar, right);

            // Calculate the maximum length encountered so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}