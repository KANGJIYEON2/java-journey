package day3;

public class DiscreteMathOperations {
    public static void main(String[] args) {
        int a = 42; // 00101010
        int b = 15; // 00001111
        int notA = ~a;    // 비트 반전
        int xorAB = notA ^ b;
        int shiftA = a << 1; // 왼쪽 1비트 시프트
        int andPart = xorAB & shiftA;
        int c = (a & b) | andPart;

        System.out.println("a      = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b      = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("~a     = " + notA + " (" + Integer.toBinaryString(notA) + ")");
        System.out.println("~a ^ b = " + xorAB + " (" + Integer.toBinaryString(xorAB) + ")");
        System.out.println("a<<1   = " + shiftA + " (" + Integer.toBinaryString(shiftA) + ")");
        System.out.println("xorAB & shiftA = " + andPart + " (" + Integer.toBinaryString(andPart) + ")");
        System.out.println("c = (a & b) | (...) = " + c + " (" + Integer.toBinaryString(c) + ")");

        // 논리 연산
        boolean p = true;
        boolean q = false;
        boolean result = (p && !q) || (p ^ q);
        System.out.println("Logical result = " + result);


        /*
        a      = 42 (101010)
        b      = 15 (1111)
        ~a     = -43 (11111111111111111111111111010101)
        ~a ^ b = -38 (11111111111111111111111111011010)
        a<<1   = 84 (1010100)
        xorAB & shiftA = 80 (1010000)
        c = (a & b) | (...) = 90 (1011010)
        Logical result = true*/

    }
}
