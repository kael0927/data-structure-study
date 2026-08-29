#include<stdio.h>
/* 删除数组指定位置的元素
   参数：arr 数组, n 当前元素个数, pos 删除位置(0-based)
   时间复杂度：O(n)，最坏情况需要移动 n 个元素
   返回值：删除后的元素个数 */
int delete(int arr[], int n, int pos)
{
    if(n <= 0){
        printf("数组为空，无法删除\n");
        return -1;
    }
    if(pos < 0||pos >= n){
        printf("删除位置无效\n");
        return -1;
     }
     /* 从后向前，将 pos 及之后的元素依次后移一位 */
     for (int i = pos; i < n; i++){
         arr[i] = arr[i + 1];
     }
     return n - 1;
   }
int main(){
    int arr[10] = {10,20,30,40};
    int n = 5;
    printf("before:");
    for(int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");

    n = delete(arr, n, 2);

    printf("after:");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}