package Hashing;


import java.util.*;

public class RepeatNum {

    private static void majorityEle(int num[]) {
        HashMap<Integer, Integer> mj = new HashMap<>();
        int n = num.length;

        for (int i = 0; i < n; i++) {
            if (mj.containsKey(num[i])) {
                mj.put(num[i], mj.get(num[i]) + 1);
            } else {
                mj.put(num[i], 1);
            }
        }

        for (int key : mj.keySet()) {
            if (mj.get(key) > n / 5) {
                System.out.println("the key: " + key + " is repeated " + mj.get(key)+"times in the array");
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 1, 4, 2, 5, 3, 7, 2, 1, 4, 3, 7, 8, 3, 0, 0, 7};
        majorityEle(num);
    }
}