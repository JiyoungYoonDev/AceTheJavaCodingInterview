package org.dataStructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysChallenges {
    // LeetCode 88
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        /*
        * two pointer
        *
        * */
        if (nums1.isEmpty()) return nums2;
        if (nums2.isEmpty()) return nums1;
        int mergedSize = nums1.size() + nums2.size();

        ArrayList<Integer> res = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < nums1.size() && p2 < nums2.size()) {
            if (nums1.get(p1) <= nums2.get(p2)) {
                res.add(nums1.get(p1));
                p1++;
            } else if (nums1. get(p1) > nums2.get(p2)) {
                res.add(nums2.get(p2));
                p2++;
            }
        }

        while (p2 < nums2.size()) {
            res.add(nums2.get(p2));
            p2++;
        }

        while (p1 < nums1.size()) {
            res.add(nums1.get(p1));
            p1++;
        }

        return res;
    }

    public static void main(String[] args) {
        // 2. MergeArrays
        ArrayList<ArrayList<Integer>> nums1 = new ArrayList<>();
        nums1.add(new ArrayList<>(Arrays.asList(23, 33, 35, 41, 44, 47, 56, 91, 105)));

        ArrayList<ArrayList<Integer>> nums2 = new ArrayList<>();
        nums2.add(new ArrayList<>(Arrays.asList(32, 49, 50, 51, 61, 99)));

        for (int i = 0; i < nums1.size(); i++) {
            System.out.println((i + 1) + ".\tFirst array: " + nums1.get(i));
            System.out.println("\tSecond array: " + nums2.get(i));
            System.out.println("\tMerged array: " + mergeArrays(nums1.get(i), nums2.get(i)));

            System.out.println(new String(new char[100]).replace("\0", "-"));
        }
    }
}
