package com.algorithm.day19;

public class Hash01 {
    public int hash(String key) {//key라고 많이 넣어줌
        int solution = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int ascii = c;//입력받은 key를 한 글자씩 아스키코드로 바꾼다
            System.out.printf("%s %d \n", c, ascii);
            solution += ascii;//아스키코드를 모두 합쳐서 고유의 값을 도출
        }
        System.out.println("asciiSum: " + solution);
        return solution % 90; // 90명의 나머지
    }

    public static void main(String[] args) {
        Hash01 T = new Hash01();
        T.hash("seoyun");
    }
}
