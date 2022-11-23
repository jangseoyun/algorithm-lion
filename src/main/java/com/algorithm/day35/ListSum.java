package com.algorithm.day35;

import java.util.ArrayList;
import java.util.List;

public class ListSum { // return 값이 있는 재귀
    public static int solution(List<Integer> list) {
        if (list.isEmpty()) {//list에 값이 없을 때 까지
            return 0;//0을 리턴한 이유는 더하기이기 때문에
        }
        int last = list.remove(list.size() - 1); // remove가 제거한 요소를 반환해 준다
        System.out.println("last: "+last);
        return last + solution(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(9);
        System.out.println( solution(list));
    }
}
