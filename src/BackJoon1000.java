import java.util.Scanner;

public class BackJoon1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        if(A > 0 && B < 10){
            System.out.println(A + B);
        }
    }
}
