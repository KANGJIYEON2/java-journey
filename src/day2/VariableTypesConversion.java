package day2;

//byte < short < int < long < float < double
public class VariableTypesConversion {
    public static void main(String[] args) {
        double d = 9.7;
        int i = (int) d; //강제형변환
        char c = (char) i; //강제형변환
        double d2 = c + 0.3; //자동형변환

        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("c = " + c); //유니코드 코드 포인트(출력되는 문자 없음) ->  제어문자(tab)이 출력
        System.out.println((int) c); //실제 숫자 출력
        System.out.println("d2 = " + d2);
        int tricky = (int) ((char) (byte) 130);
        System.out.println("tricky = " + tricky);

        /*
        d = 9.7
        i = 9
        c =
        9
        d2 = 9.3
        tricky = 65410 */


        // (byte)130 -> byte의 범위는 -128 ~ 127. 130은 오버플로우. 130 - 256 = -126 결과 : (byte) 130 == -126
        // (char)(-126) char은 unsigned 16bit (0 ~ 065535) 음수의 char로 캐스팅하면 65536을 더해 wrap around. -126 + 65536 = 65410 결과 : (char)(-126) == 65410
        // (int)(char) char를 int로 바꾸면 65410
    }
}
