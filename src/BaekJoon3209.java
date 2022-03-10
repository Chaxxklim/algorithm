
import java.util.Scanner;

public class BaekJoon3209 {

    public static void main(String[] args) {
        String inputStart;
        int inputStartHour;
        int inputStartMinute;
        int inputStartSecond;

        String inputBomb;
        int inputBombHour;
        int inputBombMinute;
        int inputBombSecond;

        int tempHour;
        int tempMinute;
        int tempSecond;

        String resultHour;
        String resultMinute;
        String resultSecond;



        Scanner sc = new Scanner(System.in);

        inputStart = sc.next();
        inputBomb = sc.next();

        String[] inputStartArray = inputStart.split(":");
        String[] inputBombArray = inputBomb.split(":");
//        System.out.println(Arrays.toString(inputStartArray));
//        System.out.println(Arrays.toString(inputBombArray));

        inputStartHour = Integer.parseInt(inputStartArray[0]);
        inputStartMinute = Integer.parseInt(inputStartArray[1]);
        inputStartSecond = Integer.parseInt(inputStartArray[2]);

        inputBombHour = Integer.parseInt(inputBombArray[0]);
        inputBombMinute = Integer.parseInt(inputBombArray[1]);
        inputBombSecond = Integer.parseInt(inputBombArray[2]);

        if (inputStartHour > inputBombHour) inputBombHour += 24;
        if (inputStartMinute > inputBombMinute ){
            inputBombMinute += 60;
            inputBombHour --;
        }
        if (inputStartSecond > inputBombSecond){
            inputBombSecond += 60;
            inputBombMinute --;
        }

        tempSecond = inputBombSecond - inputStartSecond;
        tempMinute = inputBombMinute - inputStartMinute;
        tempHour = inputBombHour - inputStartHour;

        if (tempSecond > 60){
            tempMinute ++;
            tempSecond -= 60;
        }

        if (tempMinute > 60){
            tempHour ++;
            tempSecond -= 60;
        }
        resultHour = tempHour + "";
        resultMinute = tempMinute + "";
        resultSecond = tempSecond + "";

        if (tempHour < 10) resultHour = "0" + tempHour;
        if(tempMinute < 10) resultMinute = "0" + tempMinute;
        if(tempSecond < 10) resultSecond = "0" + tempSecond;


        System.out.println(resultHour + ":" + resultMinute + ":" + resultSecond);

        sc.close();


    }
}
