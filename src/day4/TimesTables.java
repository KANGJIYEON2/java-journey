package day4;

public class TimesTables {
    public static void main(String[] args) {
        // 곱하기 계산기
            for (int i=2; i<10;i++){
                for(int j=1; j<10;j++){
                    System.out.println(i + " 곱하기 " + j + " 는 " + (i*j));
                }
            }
    }
}

//1. System.out.println("%d 곱하기 %d 는 %d", i,j,i*j); 1트였는데 ln은 format 스트링 형을 못쓴다는 것을 알았다! 쓰고 싶으면 format 이나 printf나.... 아니면 위 코드 처럼 쓰면 됨
