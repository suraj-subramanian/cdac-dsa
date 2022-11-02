package com.surajsbmn.dsa;

import java.util.Arrays;

/*
    An integer Stack data structure using array
 */
public class Stack {

    private static final int DEFAULT_SIZE = 10;
    private final int [] stack;
    private int top;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.stack = new int[size];
        this.top = -1;
    }

    public boolean isFull(){
        return this.top == this.stack.length - 1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int data) throws Exception {
        if(!isFull())
            this.stack[++top] = data;
        else
            throw new Exception("Stack is Full.");
    }

    public int pop() throws Exception {
        if(!isEmpty())
            return this.stack[top--];
        else
            throw new Exception("Stack is Empty.");
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                ", top=" + stack[top] +
                '}';
    }
}

class StackDriver{
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(5);

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        System.out.println(stack);
    }
}
