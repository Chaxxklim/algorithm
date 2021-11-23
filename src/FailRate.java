import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FailRate {
    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] tempArray = new int[stages.length];
        int[][] temp = new int[N+1][1];
        Arrays.sort(stages); // 정렬
        for (int i = 0; i < stages.length; i++) {
            int num = 0;
            if (num == stages[i]){
                num++;
            }
            tempArray[i] = num;
        }
        System.out.println(Arrays.toString(tempArray));
        System.out.println(Arrays.deepToString(temp));
        System.out.println(Arrays.toString(stages));
        return answer;
    }


    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        solution(N, stages);
    }
}