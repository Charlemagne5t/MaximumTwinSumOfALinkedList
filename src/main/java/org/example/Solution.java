package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int pairSum(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (head != null) {
            map.put(i, head.val);
            i++;
            head = head.next;
        }
        int maxSum = 0;
        for (int j = 0; j < map.size(); j++) {
            maxSum = Math.max(maxSum, map.get(j) + map.get(map.size() - j - 1));
        }
        return maxSum;
    }
}
