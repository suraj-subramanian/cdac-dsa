package com.surajsbmn.dsa;

public class SinglyLinkedList {

    private Node head;
    private static class Node {
        private final int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList(){
        this.head = null;
    }

    public void addToFront(int data){
        Node node =  new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addToBack(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    public void deleteFront(){
        if(head == null)
            return;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null)
            return;
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }


    @Override
    public String toString() {
        Node temp = head;
        StringBuilder op = new StringBuilder("Head -> ");
        if(temp != null){
            while(temp != null){
                op.append(temp.data).append(" -> ");
                temp = temp.next;
            }
        }
        op.append("NULL");
        return op.toString();
    }
}

class SinglyLinkedListDriver{
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToFront(10);
        list.addToFront(20);
        list.addToFront(30);
        System.out.println(list);
    }
}
