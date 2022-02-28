import java.util.Arrays;

class Dart {
    public static int solution(String dartResult) {

        for (int i = 0; i < dartResult.length(); i++) {
            String first;
            String second;
            String third;
            String[] split = dartResult.split("2");
            first = split[0];
            split = dartResult.split("3");
            third = "3" + split[1];

            String[] secondArray = dartResult.split(third);
        }


        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        solution(dartResult);
    }
}