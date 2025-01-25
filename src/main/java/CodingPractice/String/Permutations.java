package CodingPractice.String;

import java.util.HashSet;
import java.util.Set;

public class Permutations {
    // Helper method to generate all permutations
    private static void generatePermutations(String str, String current, Set<String> result) {
        // Base case: if current string length equals original string length, add to result
        if (current.length() == str.length()) {
            result.add(current);
            return;
        }

        // Recursive case: try every character at the current position
        for (int i = 0; i < str.length(); i++) {
            // Skip if the character is already used in this position
            if (current.indexOf(str.charAt(i)) == -1) {
                generatePermutations(str, current + str.charAt(i), result);
            }
        }
    }

    // Main method to call the permutation generation
    public static void main(String[] args) {
        String input = "abc"; // Example string
        Set<String> result = new HashSet<>();

        // Generate permutations
        generatePermutations(input, "", result);

        // Print all unique permutations
        System.out.println("Permutations of the string \"" + input + "\":");
        for (String perm : result) {
            System.out.println(perm);
        }
    }
}
