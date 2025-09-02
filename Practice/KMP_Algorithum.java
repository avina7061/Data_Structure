package Data_Structure.Practice;

import java.util.ArrayList;
class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> list = new ArrayList<>();
        int LPS[] = new int[pat.length()];
        int n = txt.length();
        int m = pat.length();

        // Step 1: Compute the LPS array (Longest Prefix Suffix)
        int len = 0;  // Length of the previous longest prefix suffix
        int i = 1;    // Start from the second character in the pattern
        LPS[0] = 0;   // LPS[0] is always 0

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                LPS[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = LPS[len - 1];  // Use the previous LPS value to skip comparison
                } else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }

        // Step 2: Perform the search using the LPS array
        int l = 0;  // Index for the text
        int p = 0;  // Index for the pattern

        while (l < n) {
            if (txt.charAt(l) == pat.charAt(p)) {
                l++;
                p++;
            }

            // If we have found a match
            if (p == m) {
                list.add(l - p);  // Add the start index of the match (1-based index)
                p = LPS[p - 1];  // Use the LPS to find the next possible match
            }
            // If there's a mismatch
            else if (l < n && txt.charAt(l) != pat.charAt(p)) {
                if (p != 0) {
                    p = LPS[p - 1];  // Use LPS to skip unnecessary comparisons
                } else {
                    l++;  // Move to the next character in the text
                }
            }
        }

        return list;
    }
}