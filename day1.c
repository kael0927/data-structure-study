#include<stdio.h>
/* 在数组的指定位置插入元素
   参数：arr 数组, n 当前元素个数, pos 插入位置(0-based),
         value 插入值, capacity 数组总容量
   时间复杂度：O(n)，最坏情况需要移动 n 个元素
   返回值：插入后的元素个数，容量不足返回 -1 */
int insert(int arr[],int n,int pos,int value,int capacity){
    if(n >= capacity){
        printf("数组已满，无法插入\n");
        return - 1;
    }
     if(pos < 0 || pos > n){
        printf("插入位置无效\n");
        return -1;
    }
}