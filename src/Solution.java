import java.util.List;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는
// 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
////        제한 조건
//        n은 10,000,000,000이하인 자연수입니다.
class Solution {
    public static String solution(String sentence) {
        String result = "";
        char[] includingText = {};
        char[] senetenceArray = sentence.toCharArray();
        char[] resultArray = {};
        List<Character> includeChar = null;
        for(int i = 0; i < senetenceArray.length; i++){
            for(char test = 'a'; test <= 'z'; test++){
                if(senetenceArray[i] == test){
                    includeChar.add(test);
                    System.out.println(test);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String sentence = "abcdefqwez";
        solution(sentence);
    }


}