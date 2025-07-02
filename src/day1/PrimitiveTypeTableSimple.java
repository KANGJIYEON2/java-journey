package day1;

public class PrimitiveTypeTableSimple {
    public static void main(String[] args) {
        System.out.println("===== 자바 기본 타입 정보 =====");

        System.out.println("byte   : size = " + Byte.BYTES + " bytes (" + (Byte.BYTES * 8) + " bits)"
                + ", min = " + Byte.MIN_VALUE
                + ", max = " + Byte.MAX_VALUE);

        System.out.println("short  : size = " + Short.BYTES + " bytes (" + (Short.BYTES * 8) + " bits)"
                + ", min = " + Short.MIN_VALUE
                + ", max = " + Short.MAX_VALUE);

        System.out.println("int    : size = " + Integer.BYTES + " bytes (" + (Integer.BYTES * 8) + " bits)"
                + ", min = " + Integer.MIN_VALUE
                + ", max = " + Integer.MAX_VALUE);

        System.out.println("long   : size = " + Long.BYTES + " bytes (" + (Long.BYTES * 8) + " bits)"
                + ", min = " + Long.MIN_VALUE
                + ", max = " + Long.MAX_VALUE);

        System.out.println("float  : size = " + Float.BYTES + " bytes (" + (Float.BYTES * 8) + " bits)"
                + ", min = " + Float.MIN_VALUE
                + ", max = " + Float.MAX_VALUE);

        System.out.println("double : size = " + Double.BYTES + " bytes (" + (Double.BYTES * 8) + " bits)"
                + ", min = " + Double.MIN_VALUE
                + ", max = " + Double.MAX_VALUE);

        System.out.println("char   : size = " + Character.BYTES + " bytes (" + (Character.BYTES * 8) + " bits)"
                + ", min = " + (int)Character.MIN_VALUE
                + ", max = " + (int)Character.MAX_VALUE);
    }
}

/*
===== 자바 기본 타입 정보 =====
byte   : size = 1 bytes (8 bits), min = -128, max = 127
short  : size = 2 bytes (16 bits), min = -32768, max = 32767
int    : size = 4 bytes (32 bits), min = -2147483648, max = 2147483647
long   : size = 8 bytes (64 bits), min = -9223372036854775808, max = 9223372036854775807
float  : size = 4 bytes (32 bits), min = 1.4E-45, max = 3.4028235E38
double : size = 8 bytes (64 bits), min = 4.9E-324, max = 1.7976931348623157E308
char   : size = 2 bytes (16 bits), min = 0, max = 65535*/

// 비트 -> 데이터 저장에 필요한 '물리적 크기' -> 0, 1로 구성, 메모리(bytes) 저장단위 -> 0,1을 저장 할 수 있는 공간
