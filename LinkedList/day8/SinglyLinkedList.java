package day8;

import java.util.function.Consumer;

public class SinglyLinkedList {
    private Node head = new Node(927,null);//哨兵节点

    public static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void addFirst(int val) {
        insert(0,val);
    }

    public void loop1(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != null) {
            consumer.accept(p.val);
            p = p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head.next; p != null; p = p.next) {
            consumer.accept(p.val);
        }
    }

    //尾插
    private Node findLast() {//方法体必须带括号
        Node p;//声明变量
        for (p = head; p.next != null; p = p.next) {

        }
        return p;
    }

    private void addLast(int val) {
        Node last = findLast();
        last.next = new Node(val, null);
    }

    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public int get(int index){
        Node node = findNode(index);
        if(node == null){
            throw new IllegalArgumentException(
                    String.format("index [%d]",index));
        }
        return node.val;
    }
    /*
    /向索引位置插入
    Params：index: -索引
            value: -待插入值
    Throw：IllegalArgumentException -找不到 抛出index非法
     */
    public void insert(int index,int val){
        Node prev = findNode(index - 1);//找到上一个节点
        if(prev == null){//找不到
            throw new IllegalArgumentException(String.format("index [%d] 不合法",index));
        }
        prev.next = new Node(val,prev.next);
    }

    public void removeFirst(){
        remove(0);
    }
    //从索引位置删除
    public void remove(int index){
        Node prev = findNode(index - 1);
        if(prev == null){
            throw new IllegalArgumentException(String.format("index [%d] 不合法",index));
        }
        //Node removed = findNode(index);不进行第二次遍历 节省性能
        Node removed = prev.next;
        if(removed == null){
            throw new IllegalArgumentException(String.format("index [%d] 不合法",index));
        }
        prev.next = removed.next;
    }
    public static void main(String[] args) {
        // 创建带哨兵的单向链表
        SinglyLinkedList list = new SinglyLinkedList();

        // 尾插 10,20,30
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("====尾插10,20,30，loop1遍历====");
        list.loop1(val -> System.out.print(val + " "));
        System.out.println("\n");

        // 头部插入 5
        list.addFirst(5);
        System.out.println("====addFirst(5)，loop2遍历====");
        list.loop2(val -> System.out.print(val + " "));
        System.out.println("\n");

        // get获取指定索引的值
        System.out.println("====get(2)====");
        System.out.println(list.get(2));
        System.out.println();

        // 在索引2位置插入99
        list.insert(2,99);
        System.out.println("====insert(2,99)====");
        list.loop2(val -> System.out.print(val + " "));
        System.out.println("\n");

        // 删除索引2
        list.remove(2);
        System.out.println("====remove(2)====");
        list.loop2(val -> System.out.print(val + " "));
        System.out.println("\n");

        // 删除头节点
        list.removeFirst();
        System.out.println("====removeFirst()====");
        list.loop2(val -> System.out.print(val + " "));
        System.out.println("\n");

        // 测试非法索引（打开注释看异常）
//        list.get(100);
//        list.insert(999, 666);
//        list.remove(999);
    }
}


