import java.util.Locale;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long temp = 1L;
        String str = "";
        int N = scanner.nextInt();
        for (int i = N; i > 0 ; i--) {
            temp *= i;
        }
        String result = String.valueOf(temp);
        for (int i = result.length() - 1; i > 0 ; i--) {
            if(result.charAt(i) != '0'){
                str += result.charAt(i);
            }
        }
        for (int i = 4; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
