package src;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        String input = "swiss";
        findNonRepeatingCharacters(input);
    }


    public static void findNonRepeatingCharacters(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count character occurrences
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print non-repeating characters
        System.out.print("Non-repeating characters: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}