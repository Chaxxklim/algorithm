import java.util.Arrays;
import java.util.Scanner;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i <= n; i++) {
                arr2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        String arr1Str;
        String arr2Str;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1 ){

            }
        }
        String[] answer = {};
        return answer;
    }
}
