package Data_Structure.Extra_Question_Practice;

import java.util.*;

public class MoveToTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            // Store original array and frequency map
            Map<Long, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            }

            // Create result array
            long[] ans = new long[n];

            // TreeMap to maintain sorted elements by value
            TreeMap<Long, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
            treeMap.putAll(freqMap);

            // First entry is the maximum value
            ans[0] = treeMap.firstKey();

            // Calculate sum from right to left and update the TreeMap
            long sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                // Remove one occurrence of arr[i] from the TreeMap
                long val = arr[i];
                int count = freqMap.get(val);
                if (count == 1) {
                    freqMap.remove(val);
                    treeMap.remove(val);
                } else {
                    freqMap.put(val, count - 1);
                    treeMap.put(val, count - 1);
                }

                // Add to running sum
                sum += val;

                // Calculate answer for the next position
                if (i > 0) {  // Ensure we don't go out of bounds
                    if (!treeMap.isEmpty()) {
                        ans[n - i] = sum + treeMap.firstKey();
                    } else {
                        ans[n - i] = sum;
                    }
                }
            }

            // Print result
            for (long val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}