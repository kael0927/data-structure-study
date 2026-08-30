package day6;

public class BinarySearchLeftmost {
    // 静态内部类：二分查找-找最左匹配
    public static int binarySearchLeftmost(int[] a,int target){
        int i = 0,j = a.length - 1;
        int candidate = -1;
        while(i <= j){
            int m = (i + j) >>> 1;
            if(a[m] < target){
                i = m + 1;
            } else if(target < a[m]){
                j = m - 1;
            } else {
                candidate = m;// 找到target，记录位置，但继续向左搜索，找更靠左的
                j = m - 1;
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        int[] a = {1,2,4,6,7,7,8};
        int n = BinarySearchLeftmost.binarySearchLeftmost(a,7);// 静态方法直接 类名.方法() 调用，不用new
        System.out.println("最左边的目标值索引" + n);
    }
}
