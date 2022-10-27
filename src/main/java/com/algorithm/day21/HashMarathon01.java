package com.algorithm.day21;

import java.util.HashMap;
import java.util.Map;

public class HashMarathon01 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> tmpMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            // 바로 put을 하지 않습니다.
            // 바로 put을 할 수도 없고 숫자를 올리긴 해야겠고
            if (!tmpMap.containsKey(key)) {
                tmpMap.put(key, 0);
            }
            tmpMap.put(key, tmpMap.get(key) + 1);
        }


        for (int i = 0; i < completion.length; i++) {
            String key = completion[i]; // value 1
            tmpMap.put(key, tmpMap.get(key) - 1);
        }

        System.out.println(tmpMap);

        for (String person : tmpMap.keySet()) {
            if (tmpMap.get(person) == 1) {
                return person;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        HashMarathon01 T = new HashMarathon01();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(T.solution(participant, completion));
    }
}
