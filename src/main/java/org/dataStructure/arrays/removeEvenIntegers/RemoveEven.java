package org.dataStructure.arrays.removeEvenIntegers;

public class RemoveEven {
    public static int[] removeEven(int[] arr) {
        // int[] res = new int[] {};
        int oddCount = 0;

        // to track the odd #
        for (int j : arr) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }

        int[] res = new int[oddCount];
        int index = 0;
        // if num is odd number add to res
        for (int num : arr) {
            if (num % 2 != 0) {
                res[index++] = num;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] test = {0, 20, 41};
        int [] res = removeEven(test);

        for(int num : res) {
            System.out.println(num);
        }
    }
}
