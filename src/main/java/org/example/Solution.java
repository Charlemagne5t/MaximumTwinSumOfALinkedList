package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int maxSum = 0;
        for (int j = 0; j < list.size(); j++) {
            maxSum = Math.max(maxSum, list.get(j) + list.get(list.size() - j - 1));
        }
        return maxSum;
    }
}
