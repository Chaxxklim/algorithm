import java.util.*;

class OpenChat {
    public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[][] array = new String[ren][3];
        for(int i = 0; i < record.length;; i++){
            array[i][0] = record[i].split(" ")[0]; // Action
            array[i][1] = record[i].split(" ")[1]; // id
            if(array[i][0].equals("Enter") || array[i][0].equals("Change")) {
                array[i][2] = record[i].split(" ")[2]; // Nick
                map.put(array[i][1], array[i][2]); // "id", "nick"
            }
        }

        for (int i = 0; i < record.length; i++){
            if(array[i][0].equals("Enter")){
                String str = "";
                str = map.get(array[i][1]) + "님이 들어왔습니다.";
                list.add(str);
            } else if (array[i][0].equals("Leave")){
                String str = "";
                array[i][0] = record[i].split(" ")[0]; // Action
                array[i][1] = record[i].split(" ")[1]; // id
                str = map.get(array[i][1]) + "님이 나갔습니다.";
                list.add(str);
            } else {
                continue;
            }
        }
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

    }
}