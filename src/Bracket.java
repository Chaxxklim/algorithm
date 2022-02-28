import java.util.Arrays;

public class Bracket {


    public String solution(String p) {
        String answer = "";
        return answer;
    }
    public static void check(){
        String exBracket1 = "(()())()";
        String exBracket2 = ")(";
        String exBracket3 = "()))((()";
        char[] bracketArray = exBracket1.toCharArray();
        System.out.println(Arrays.toString(bracketArray));
        int leftBracket = 0;
        int rightBracket = 0;

        for (int i = 0; i < bracketArray.length; i++) {
            if (bracketArray[i] == '('){
                leftBracket++;
            }else if (bracketArray[i] == ')'){
                rightBracket++;
            }else if(leftBracket == rightBracket){

            }
        }

    }

    public static void main(String[] args) {
        check();
    }

}
