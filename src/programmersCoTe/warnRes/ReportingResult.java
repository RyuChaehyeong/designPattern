package programmersCoTe.warnRes;

import java.util.*;
import java.util.stream.Collectors;

public class ReportingResult {

    public int[] solution(String[] id_list, String[] report, int k) {

        //key : reported, value : reporting
        Map<String, Set<String>> map = new HashMap<>();

        for (String tmp : report) {
            String[] arr = tmp.split(" ");
            Set<String> set = map.getOrDefault(arr[1], new HashSet<>());
            set.add(arr[0]);
            map.put(arr[1], set);
        }

        //key : 결과 받을 user, value : 결과 받을 횟수
        Map<String, Integer> cntMap = new LinkedHashMap<>();

        for (String id : id_list) {
            cntMap.put(id, 0);
        }

        //
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= k) {
                for (String value : entry.getValue()) {
                    cntMap.put(value, cntMap.getOrDefault(value, 0) + 1);
                }
            }
        }

        return cntMap.values().stream().mapToInt(Integer::intValue).toArray();
    }

}
