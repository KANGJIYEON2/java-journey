package day5;

public class HardScope {
    private static int counter = 0; // 클래스가 살아있는 한 메타스페이스에 남아있음(static)
    private int value = 10; // 이 객체가 살아있는 동안 유지되는 값(힙 -> 객체내부)

    public void play(int value) { // play를 부를 때 넘겨준 값이 여기로 들어옴( 매세드 안에서 가장 가까움)
        value += 5; // 이 value는 위의 파라미터, 필드의 value(10)은 건들지 않음
        counter++; // static이라서 객체가 달라도 하나만 존재, 계속 +1
        System.out.println("param value = " + value); // 위에서 넘겨준 값 +5 출력
        System.out.println("field value = " + this.value); // 객체 안에 있는 value(10)출력
        System.out.println("static counter = " + counter); // 지금까지 play를 호출한 횟수 출력
    }

    public static void main(String[] args) {
        HardScope h1 = new HardScope(); // 첫번재 객체
        HardScope h2 = new HardScope(); // 두번째 객체
        h1.play(10); // 10 + 5 = 15 출력, field는 그대로 10, static은 1
        h1.play(20); // 20 + 5 = 25 출력, field는 여전히 10, static은 2
    }

}
/*
param value = 15
field value = 10
static counter = 1
param value = 25
field value = 10
static counter = 2
*/