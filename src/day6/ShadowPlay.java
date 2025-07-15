package day6;

public class ShadowPlay {
    static int staticValue = 10; // 클래스 변수(공유)
    int instanceValue = 10; // 인스턴스 변수(개별)

    void change(int staticValue, int instanceValue) {
        staticValue += 1;        // 파라미터만 증가 (shadowing)
        instanceValue += 1;       // 파라미터만 증가 (shadowing)

        this.staticValue += 1;    // 공유 static 증가
        this.instanceValue += 1;  // 자기 instance 증가

        System.out.println("메서드 안에서:");
        System.out.println("  파라미터 staticValue = " + staticValue);
        System.out.println("  파라미터 instanceValue = " + instanceValue);
        System.out.println("  this.staticValue = " + this.staticValue);
        System.out.println("  this.instanceValue = " + this.instanceValue);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        ShadowPlay a = new ShadowPlay();
        ShadowPlay b = new ShadowPlay();

        System.out.println("== a.change() 호출 ==");
        a.change(10, 10);

        System.out.println("== b.change() 호출 ==");
        b.change(10, 10);

        System.out.println("== a.change() 다시 호출 ==");
        a.change(10, 10);

        System.out.println("\n== 최종 상태 ==");
        System.out.println("staticValue = " + ShadowPlay.staticValue);
        System.out.println("a.instanceValue = " + a.instanceValue);
        System.out.println("b.instanceValue = " + b.instanceValue);
    }
}
/*
결과값:
== a.change() 호출 ==
메서드 안에서:
  파라미터 staticValue = 11
  파라미터 instanceValue = 11
  this.staticValue = 11
  this.instanceValue = 11
----------------------
== b.change() 호출 ==
메서드 안에서:
  파라미터 staticValue = 11
  파라미터 instanceValue = 11
  this.staticValue = 12
  this.instanceValue = 11
----------------------
== a.change() 다시 호출 ==
메서드 안에서:
  파라미터 staticValue = 11
  파라미터 instanceValue = 11
  this.staticValue = 13
  this.instanceValue = 12
----------------------

== 최종 상태 ==
staticValue = 13
a.instanceValue = 12
b.instanceValue = 11
*/
/*
결과 요약:
- staticValue 는 static 변수(클래스 변수)라서
  모든 객체가 공유 → 호출할 때마다 계속 증가 (최종 13).

- instanceValue 는 인스턴스 변수(객체 개별)라서
  a 와 b 가 각각 따로 증가.
  a 는 2번 change() 해서 12,
  b 는 1번 change() 해서 11.

- 메서드 파라미터 staticValue, instanceValue 는
  메서드 안에서만 쓰이는 지역변수라
  실제 필드(staticValue, instanceValue) 와는 별개.
*/