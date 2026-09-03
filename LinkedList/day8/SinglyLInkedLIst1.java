package day8;

import java.util.function.Consumer;

public class SinglyLInkedLIst1 {
    private Node head;

    public static class Node{
        int value;
        Node next;

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    //添加头节点
    public void addFirst(int value){
        Node p = new Node(value,null);
        p.next = head;
        head = p;
    }
    //遍历
    public void loop(Consumer<Integer> consumer){
        Node p = head;
        while(p != null){
            consumer.accept(p.value);
            p = p.next;
        }
    }
    //查找节点
    public Node findNode(int index){
        int i = 0;
        for(Node p = head; p != null; p = p.next,i++){
            if(index == i){
                return p;
            }
        }
        return null;
    }
    //查找尾节点
    private Node findLast(){
        Node p;
        for(p = head;p != null; p = p.next){

        }
        return p;
    }
    //添加尾节点
    private void
}
