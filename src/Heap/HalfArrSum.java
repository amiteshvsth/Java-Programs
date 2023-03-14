package Heap;

import java.util.*;

class HalfArrSum {
    static int minops(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            pq.add(-nums.get(i));
        }
        double temp = sum;
        int cnt = 0;
        while (temp > sum / 2) {
            int x = -pq.peek();
            pq.remove();
            temp -= Math.ceil(x * 1.0 / 2);
            pq.add(x / 2);
            cnt++;
        }
        return cnt;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<Integer>(
                List.of(
                        4, 6, 3, 9, 10, 2));
        int count = minops(nums);
        System.out.println(count);
    }
}
