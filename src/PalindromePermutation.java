import java.util.HashMap;

/**
 * Created by Omer on 11/11/2016.
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!countMap.containsKey(s.charAt(i))) {
                countMap.put(s.charAt(i), 0);
            }
            int val = countMap.get(s.charAt(i));
            countMap.put(s.charAt(i), val + 1);
        }

        int oddCount = 0;

        for (Character c : countMap.keySet()) {
            if (countMap.get(c) % 2 == 1) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }
}
