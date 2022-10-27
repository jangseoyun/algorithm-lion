package com.algorithm.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMarathon {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, String> tmpMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            tmpMap.put(participant[i], "participant");
        }

        for (int i = 0; i < completion.length; i++) {
            tmpMap.put(completion[i], "completion");
        }

        System.out.println(tmpMap);

        for (String person : tmpMap.keySet()) {
            String result = "participant";
            if (tmpMap.get(person).equals(result)) {
                answer =  person;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        HashMarathon T = new HashMarathon();
        Scanner sc = new Scanner(System.in);
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        T.solution(participant, completion);
    }
}
