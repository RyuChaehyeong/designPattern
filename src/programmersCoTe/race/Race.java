package programmersCoTe.race;

import java.util.*;

public class Race {
    public static String solution1(String[] participant, String[] completion) {

        //Arrays 정렬해서 다른 이름 찾기
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for (i=0; i<completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                break;
            }
        }
        return participant[i];

    }
    public static String solution2(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String parti : participant) {
            map.put(parti, map.getOrDefault(parti, 0) + 1);
        }
        for (String compl : completion) {
            map.put(compl, map.get(compl) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String res1 = solution1(participant, completion);
        System.out.println(res1);

        String res2 = solution2(participant, completion);
        System.out.println(res2);
    }
}
