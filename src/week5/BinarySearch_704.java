package week5;

public class BinarySearch_704 {

    public static void main(String[] args) {
        BinarySearch_704 a = new BinarySearch_704();
        int[] nums = {2, 5};
        int target = 5;
        System.out.println(a.search(nums, target));
    }


    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);

    }

    int binarySearch(int[] nums, int target, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) {
            if (nums[leftIndex] == target) {
                return leftIndex;
            } else {
                return -1;
            }
        } else if (leftIndex > rightIndex) {
            return -1;
        }
        if (rightIndex - leftIndex == 1) {
            if (nums[leftIndex] == target) {
                return leftIndex;
            }
            if (nums[rightIndex] == target) {
                return rightIndex;
            } else {
                return -1;
            }

        }
        int mid = (rightIndex - leftIndex) / 2;

        mid = leftIndex + mid;
        if (nums[mid] < target) {
            return binarySearch(nums, target, mid, rightIndex);
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, leftIndex, mid);
        } else {
            return mid;
        }
    }
}
