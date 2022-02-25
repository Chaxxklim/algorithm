public class TwoDice {
    public static void main(String[] args) {
        // 두개의 주사위를 던질게요 주사위 눈이 1부터겠져? 일단 하나 던졌어요 그 다음거는 어떻게 던질까요
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < 6; j++) {
                //검사를 어떻게 할까요
                // 긍게 숫자 말고 여기서 각각의 눈이라고 선언한 변수명 good
                //그럼 그 눈의 합을 뭐라고 쓰죠
                //그걸 검사를 어케하죠 자바에서 검사하는건? 조건?
                if (i + j == 6) System.out.println(i + " + " + j + " = " + (i + j));
            }
        }
    }
}
