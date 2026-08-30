package day6;

public class searchInsert{
    public int searchInsert(int[] nums,int target){
        int i = 0,j = nums.length - 1;
        while(i <= j){
            int mid = (i + j) >>> 1;
            if(target < nums[mid]){
                j = mid - 1;
            } else if(nums[mid] < target){
                i = mid + 1;
            } else {
               return mid;
            }
        }
        return i;
    }
    public int searchInsert2(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) >>> 1;
            if(target <= nums[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
