import java.util.*;

public class Kakao2022Report {
    public static int[] solution(String[] id_list, String[] report, int k){
        Map<String, String> reportMap = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, String> stopMember = new HashMap<>();
        for (String reportId : report) {
            String[] array = reportId.split(" ");
            reportMap.put(array[0], reportMap.getOrDefault(array[0], "") + ", " + array[1]);
        }
        for (String str : reportMap.keySet()) {
            String value = reportMap.get(str);
            String[] split = value.split(", ");
            for (String splitStr : split){
                reportCount.put(splitStr, reportCount.getOrDefault(splitStr, 0) + 1);
            }
        }
        for (String reportCountstr : reportCount.keySet()) {
            if(reportCount.get(reportCountstr) >= k){
                for (String reportMapStr: reportMap.keySet()) {
//                    if(reportMap.get(reportMapStr) == )
                }
            }
        }
        for (String str : reportMap.keySet()) {
            System.out.println(str + ": " + reportMap.get(str));

        }






        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] solution = solution(id_list, report, k);
    }
}
