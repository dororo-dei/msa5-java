package org.example.e02operator;

public class E02Operator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;

        // 산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 * num2);
        System.out.println(num1 % num2);

        // 산술 대입 연산자
        int num3 = 1;
        num3 = num3 + 3;
        num3 += 3;
        num3 -= 3;
        num3 /= 3;
        num3 *= 3;
        num3 %= 3;

        // 증감 연산자
        int num5 = 0;
        System.out.println(num5++); // 후위 증감 연산자 0
        System.out.println(++num5); // 전위 증감 연산자 2

        // 비교 연산자
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열의 비교
        String str1 = "str1";
        String str2 = "str1";
        System.out.println(str1.equals(str2));

        // 논리 연산자
        int num10 = 0;
        int num11 = 2;

        System.out.println(num10 > 0 && num11 <= 11); // and 연산자
        System.out.println(num10 > 0 || num11 <= 11); // or 연산자
        System.out.println(!(num10 > 0)); // not 연산자

        // 삼항 연산자
        String result = num1 > num2 ? "num1 크다" : "num1이 작다";
    }
}
