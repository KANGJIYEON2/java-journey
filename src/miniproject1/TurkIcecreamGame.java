package miniproject1;

/*
 * 🎩 터키 아이스크림 가게 - 콘솔 미니게임 기능 정리 🍦
 *
 * 1. 사용자에게 콘솔창에서 아이스크림 종류를 입력받는다.
 *    - 1. 초코 아이스크림
 *    - 2. 바닐라 아이스크림
 *    - 3. 딸기 아이스크림
 *    → "[아이스크림명] 주문 받았쥐~" 라고 출력
 *
 * 2. 부속 재료를 숫자로 입력받는다.
 *    - 1. 땅콩
 *    - 2. 초코
 *    - 3. 녹차
 *    - 4. 사랑 ♥️
 *
 * 3. 아이스크림 잡기 이벤트 시작!
 *    - "못 잡겠쥐~", "어림없쥐~", "잡아야쥐~", "주세요 해야쥐~" 등의 대사를
 *      랜덤하게 출력하며 반복
 *    - 대사도 랜덤, 반복 횟수도 랜덤
 *
 * 4. 랜덤 횟수 도달 시:
 *    - "어라? 잡았네~" 출력
 *    - "[부속 재료] [아이스크림명] 터키 아이스크림 완성~" 출력
 *
 * 5. 최종 금액 출력
 *    - "금액은 [x]원입니다~"
 *    - 많이 놀림당할수록 금액은 낮아진다 (반비례)
 *
 */

import java.util.Scanner;

public class TurkIcecreamGame {

    public static void main(String[] args) {
        System.out.println("===맛있는 터키아이스크림 가게에 오신걸 환영합니다.😎===");
        System.out.println("아이스크림을 골라주세요(숫자로 입력)");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.초코아이스크림 2.바닐라아이스크림 3.딸기아이스크림");
        String iceNum = sc.nextLine();
        iceNum = switch (iceNum) {
            case "1" -> "초코아이스크림";
            case "2" -> "바닐라아이스크림";
            case "3" -> "딸기아이스크림";
            default -> "없습니다요 😭`";
        };
        System.out.println("당신이 고른 아이스크림은 " + iceNum);
    }
}
