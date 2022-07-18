package org.manjunath.arrays;

public class RemoveElementFromArray {

    /**
     * Method to remove the mentioned element from the array and return the
     * count of remaining elements in the array.
     *
     * @param nums Integer Array
     * @param val  Integer value to be removed from the array
     * @return Count of remaining elements or index of array.
     */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n : nums) {
            // if the element is not equal to val, then replace the element.
            if (n != val) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }

    public int removeElementMethod2(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if ((nums[start] == nums[end]) && (nums[start]== val)) {
                end--;
                continue;
            }
            if (nums[start] == val) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;

                end--;
            }
            start++;
        }

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            }
        }

        return k;
    }
}
