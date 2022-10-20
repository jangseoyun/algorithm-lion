package com.algorithm.day15;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public int[] push(int value) {
        arr[pointer] = value; //스택 마지막에 값 넣기
        pointer++; //top 증가
        return arr;
    }

    public int pop() {
        int getValue = arr[pointer - 1];
        pointer--;
        return getValue;
    }

    public int[] getArr() {
        return arr;
    }

}
