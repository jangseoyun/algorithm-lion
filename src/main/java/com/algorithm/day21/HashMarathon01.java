package com.algorithm.day21;

import java.util.HashMap;
import java.util.Map;

public class HashMarathon01 {

    /**
     * 스트링으로 접근할 경우 value를 올려줄 수 없기 때문에 Integer로 다시 구현
     * @param participants
     * @param completions
     * @return
     */
    public String solution(String[] participants, String[] completions) {
        String answer = "";
        Map<String, Integer> tmpMap = new HashMap<>();

        for (String participant : participants) {
            tmpMap.put(participant, tmpMap.getOrDefault(participant, 0) + 1);
        }

        for (String completion : completions) {
            tmpMap.put(completion, tmpMap.getOrDefault(completion, 0) - 1);
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
