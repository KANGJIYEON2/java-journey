package day1;

public class VariableTypes {
    public static void main(String[] args) {
        int num = 20;
        char ch = '가';
        float num2 = 3.14f;
        double dnum = 2.12321;
        String str = "Hello";
        boolean bool = true;
        System.out.printf("%d, %c, %.2f, %.0f, %s, %b", num, ch, num2, dnum, str, bool);
        // 20, 가, 3.14, 2.12321, Hello, true
        // % -> 서식 지정자(데이터 문자열) 시작,  . -> 소수점 표시, number -> 자리수, f -> 실수 형식으로 출력

    }

}
