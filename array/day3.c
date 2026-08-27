#include<stdio.h>
//1.指针函数：本质是【函数】，返回值是指针
int* getMax(int a,int b)
{
    static int res;//静态局部变量，不能返回普通局部变量地址
    res = (a > b) ? a : b;
    return &res;
}
//2.数组指针：本质是【指针】，指向一整个数组
void testArrPtr()
{
    int arr[3][2] = {{1, 3}, {5, 7}, {9, 11}};
    int (*p)[2] = arr;//数组指针，指向1一行2个int的数组
    printf("数组指针 p+1 偏移后地址：%p\n", (void *)(p + 1));
    printf("p[1][0] = %d\n", p[1][0]);//等价*(*(p+1)+0)
}
//3.指针数组：本质是【数组】，数组里面存的都是指针
void testPtrArr()
{
    int x = 10, y = 20, z = 30;
    int *p[3] = {&x, &y, &z};//指针数组：3个int*组成的数组
    print("指针数组p[0]指向的向：%d\n", *p[0]);
}
int main(void)
{
    // 测试指针函数
    int *pMax = getMax(6, 9);
    printf("指针函数结果：%d\n", *pMax);
    printf("------------------------\n");

    // 测试数组指针
    testArrPtr();
    printf("------------------------\n");

    // 测试指针数组
    testPtrArr();
    printf("------------------------\n");

    // 测试函数指针
    testFuncPtr();

    return 0;
}