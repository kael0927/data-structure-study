package day5;

public class BinarySearch2
{
    /*
    1.左闭右开的区间，i指向的可能是目标，而j指向的不是目标
    2.不在循环内找出，等范围内只剩i时，退出循环，在循环外比较a[i]与target
    3.循环内的平均比较次数减少
    4.时间复杂度log(n)
     */
    public static int binarySearchBalance(int[] a, int target) {
        int i = 0, j = a.length;
        while (1 < j - i) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m;
            } else {
                i = m;
            }
        }
        if(a[i] == target) {
            return i;
        } else {
            return -1;
        }
        
    }
}