package com.algorithm.day20;

import java.util.ArrayList;
import java.util.List;

public class HashTable02 {
    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    List<Node>[] table = new ArrayList[1000];

    public HashTable02() {
        this.table = table;
    }

    //1. key 만들어 주기
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 1000;//나머지로 index를 만드는 이유 :
        // ex) 배열 사이즈가 1000이면 asciiSum % 1000을 하면 0~999 사이의 값이 나와서 벗어나지 않음
        // 지정된 크기의 배열에 값을 저장하기 때문이다.
        // 사이즈로 정한 배열의 어딘가로 가도록 하기 위함
    }

    //2. table에 키와 밸류를 넣어준다 : key번째 방에 value 넣기
    public void insert(String key, int value) {
        int hashindex = hash(key);
        if (table[hashindex] == null) {//데이터를 넣은 적이 없으면
            table[hashindex] = new ArrayList<>();
        }
        //방법은 2가지 Map을 써서 넣거나 Object를 생성하여 넣는다
        table[hashindex].add(new Node(key, value));//키하고 밸류를 같이 넣어줘야한다
    }

    //3. 키를 통해서 값 찾기
    public Integer search(String key) {//return형 int는 null허용 안함
        List<Node> nodes = table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable02 ht = new HashTable02();
        ht.insert("Yoonseo", 1);
        ht.insert("seoyun", 2);

        int result = ht.search("Yoonseo");
        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }

    }

}
