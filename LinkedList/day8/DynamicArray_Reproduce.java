package day8;

public class DynamicArray_Reproduce {
    private int[] data;
    private int size;//记录有效元素个数

    public DynamicArray_Reproduce(int initCapacity) {
        data = new int[initCapacity];
        size = 0;
    }

    public DynamicArray_Reproduce() {
        this(10);
    }//构造函数与类同名 无返回型

    public void add(int index, int value) {
        if (index < 0 || index > size) {//判定条件避免跳位插入
            throw new IllegalArgumentException("索引非法");
        }
        if (size == data.length) {
            resize(data.length * 2);
        }
        data[index] = value;
        size++;
    }

    //扩容
    public void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
    }

    //索引取消
    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引非法");
        }
        return data[index];
    }

    //修改指定元素
    public void set(int index, int value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引非法");
        }
        data[index] = value;
    }

    //判空
    public boolean isEmpty() {
        return size == 0;
    }

    //返回有效元素个数
    public int size() {
        return size;
    }
    //删除并获取指定索引元素
    public int remove(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("索引非法");
        }
        int oldValue = data[index];
        for(int i = index; i < size; i++){
            data[index] = data[i + 1];
        }
        return oldValue;
    }
    static void main(String[] args) {
        DynamicArray_Reproduce list = new DynamicArray_Reproduce();
        list.add(0, 1);  //size=0，index只能写0
        list.add(1, 4);  //size=1，可以index=1
        list.add(2, 7);  //size=2，可以index=2

        System.out.println(list.get(1)); //4
        list.set(1,99);
        System.out.println(list.get(1)); //99
        list.isEmpty();
        list.remove(0);
        System.out.println(list.get(0)); //99
        System.out.println(list.size());  //2
    }
}