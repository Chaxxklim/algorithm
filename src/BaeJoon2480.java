import java.util.Scanner;

public class BaeJoon2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int tempNum = 0;
        int[] userInput = new int[3];
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] == userInput[i+1] && userInput[i] == userInput[i+2]) result = 3;
            if (userInput[i] == userInput[i+1] && userInput[i] != userInput[i+2]) result = 2;
            if (userInput[i] != userInput[i+1] && userInput[i] == userInput[i+2]) result = 2;
            if (userInput[i] != userInput[i+1] && userInput[i] != userInput[i+2]) result = 1;
        }
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] - userInput[i+1] > 0 && userInput[i] - userInput[i+2] > 0) userInput[i] = tempNum;
        }

        System.out.println("result" + result + "tempNum" + tempNum);

    }
}
