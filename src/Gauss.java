import java.util.Scanner;

public class Gauss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("start");
        int result = 0; // 합을 0으로 초기화한다.
        int input = scanner.nextInt();

//        for (int i = 0; i <= input; i++) {
////            result += i; //이해돼요 ?  < - ??
//            result = result + i;
//        }  // 얘가 필요가 없겠쬬?

        result = input * (input + 1) / 2;

        System.out.println(result);
    }
}
