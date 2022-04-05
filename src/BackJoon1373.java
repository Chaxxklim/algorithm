import java.util.Scanner;

public class BackJoon1373 {
    public static void main(String[] args) {
//        문제
//        2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
//
//                출력
//        첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String reverse = "";
        String result = "";
        int num = 0;
        int temp = 1;
        int degree = 0;
        if(input.length() <= 1000000){
            for (int i = input.length(); i > 0; i--) {
                reverse += input.charAt(i - 1);
            }
        }
        for (int i = 0; i < reverse.length(); i++) {
            if(reverse.charAt(i) != '0'){
                temp = 1;
            } else{
                temp = 0;
            }
            for (int j = 0; j < degree; j++) {
                temp *= 2;
            }
            num += temp;
            degree++;
        }
        while(true){
            String tmp = String.valueOf(num % 8);
            num /= 8;
            result += tmp;
            if((num / 8) < 1 ){
                result += num % 8;
                break;
            }
        }
        reverse = "";
        for (int i = result.length(); i > 0 ; i--) {
            reverse += result.charAt(i - 1);
        }
        System.out.println(reverse);
        sc.close();
    }
}
