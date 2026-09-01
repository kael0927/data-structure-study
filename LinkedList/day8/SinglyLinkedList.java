package day8;

import java.util.function.Consumer;

public class SinglyLinkedList {
    private Node head;

    public static class Node{
        int val;
        Node next;

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void addFirst(int val){
        head = new Node(val,head);
    }

    public void loop1(Consumer<Integer> consumer){
        Node p = head;
        while(p != null){
            consumer.accept(p.val);
            p = p.next;
        }
    }

    public void loop2(Consumer <Integer> consumer){
        for(Node p = head; p != null; p = p.next){
            consumer.accept(p.val);
        }

    }
}
