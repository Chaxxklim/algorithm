import java.util.*;

public class BackJoon2490 {
    public static void main(String[] args) {
/*
        우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정한다.
        네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때 도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개) 중
        어떤 것인지를 결정하는 프로그램을 작성하라.
        입력
        첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가 빈칸을 사이에 두고 주어진다.
                첫째 줄부터 셋째 줄까지 한 줄에 하나씩 결과를 도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력한다.
*/
        Scanner sc = new Scanner(System.in);
        List<String> resultList = new ArrayList<>();
        String result = "";
        for (int i = 1 ; i <= 3; i++) {
            int count = 0;
            List<Integer> list = new ArrayList<>();
            list.add(Integer.valueOf(sc.next()));
            list.add(Integer.valueOf(sc.next()));
            list.add(Integer.valueOf(sc.next()));
            list.add(Integer.valueOf(sc.next()));
            for (int item : list) {
                if(item == 0) count++;
            }
            switch (count){
                case 0 : result = "E";
                    break;
                case 1 : result = "A";
                    break;
                case 2 : result = "B";
                    break;
                case 3 : result = "C";
                    break;
                case 4 : result = "D";
                    break;
            }
            resultList.add(result);
        }
        resultList.forEach(System.out::println);
    }
}
