package com.algorithm.day16;

public class Stack02 {

    private Integer[] arr;
    private int top;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int setNum) {
        arr[top] = setNum;
        top++;
        //arr[top++] = setNum;
    }

    public int pop() {
        //arr[--top];
        Integer pop = arr[top - 1];
        top--;
        return pop;
    }

}
