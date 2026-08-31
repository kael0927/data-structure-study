package day7;

public class DynamicArray {
    private int[] data;
    private int size;
    //构造器：指定初始容量
    public DynamicArray(int initCapacity){
        data = new int[initCapacity];
        size = 0;
    }
    public DynamicArray(){
        this(10);
    }

    public void add(int index,int element){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("索引非法");
        }
        if(size == data.length){
            resize(data.length * 2);
        }
        for(int i = size; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    //私有扩容方法：新建更大数组，复制旧元素
    private void resize(int newCapacity){
        int[] newData = new int[newCapacity];
        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        //data引用指向新数组，就数组等待GC回收
        data = newData;
    }
    //根据下标获取元素
    public int get(int index){
        //边界检验
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("索引越界");
        }
        return data[index];
    }

    //修改指定位置元素
    public void set(int index,int val){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("索引越界");
        }
        data[index] = val;
    }

    // 返回有效元素个数
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //删除指定索引元素
    public int remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("索引越界");
        }
        int oldVal = data[index];
        //index后面的元素全部向前移动一位
        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
        return oldVal;
    }
    public static void main(String[] args) {
        DynamicArray list = new DynamicArray();
        list.add(0, 1);  //size=0，index只能写0
        list.add(1, 4);  //size=1，可以index=1
        list.add(2, 7);  //size=2，可以index=2

        System.out.println(list.get(1)); //4
        list.set(1,99);
        System.out.println(list.get(1)); //99

        list.remove(0);
        System.out.println(list.get(0)); //99
        System.out.println(list.size());  //2
    }


}
