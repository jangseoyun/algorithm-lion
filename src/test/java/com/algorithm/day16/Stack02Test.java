package com.algorithm.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("stack")
class Stack02Test {

    @BeforeEach
    void setUp() {
        Stack02 st = new Stack02();
        System.out.println("beforeEach");
    }

    @DisplayName("push")
    @Test
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @DisplayName("pop")
    @Test
    void pop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }

    @DisplayName("isEmpty")
    @Test
    void isEmpty() {
        Stack02 st = new Stack02();

        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @DisplayName("realStack")
    @Test
    void realStack() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(EmptyStackException.class, () -> {
            stack.peek();
        });
        assertThrows(EmptyStackException.class, () -> {
            stack.pop();
        });
    }

    @DisplayName("poshAndPop")
    @Test
    void poshAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        //스택이 비어 있을때는?
        // exception 예외의 검증
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });
    }

    @DisplayName("peek")
    @Test
    void peek() {
        Stack02 st = new Stack02();
        assertThrows(EmptyStackException.class, ()-> {
            int peeked = st.peek();
        });

        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }

}