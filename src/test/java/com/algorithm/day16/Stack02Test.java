package com.algorithm.day16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("stack")
class Stack02Test {

    @BeforeEach
    void setUp() {
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

    @DisplayName("Name")
    @Test
    void Name() {

    }
}