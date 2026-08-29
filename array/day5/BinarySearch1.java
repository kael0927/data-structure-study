package day5;

import java.util.Arrays;

public class BinarySearch1 {
    /**
 * 二分查找 + 数组元素插入示例
 * 利用Arrays.binarySearch获取目标值应当插入的位置，再完成数组插入
 */
    public void test0()
    {
        int[] a = { 2, 5, 7, 8, 9 };
        int target = 4;
        // 找到：返回元素下标；未找到：返回 -(插入位置) -1
        int i = Arrays.binarySearch(a, target);
        System.out.println(i);

        if (i < 0) {
            int insertIndex = Math.abs(i + 1);
            int[] b = new int[a.length + 1];
            // 复制插入点之前的数据到新数组
            System.arraycopy(a, 0, b, 0, insertIndex);
            b[insertIndex] = target;
            // 复制插入点及之后的数据，往后挪一位
            System.arraycopy(a, insertIndex, b, insertIndex + 1, a.length - insertIndex);
            System.out.println(Arrays.toString(b));
        }
    }
    public static void main(String[] args) {
        BinarySearch1 demo = new BinarySearch1();
        demo.test0();
    }
}
