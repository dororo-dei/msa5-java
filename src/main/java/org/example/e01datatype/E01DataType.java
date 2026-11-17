package org.example.e01datatype;

import java.net.SocketOption;

public class E01DataType {
    public void execute() {
        boolean bool = true;
        bool = false;
        // bool = 1; 선언할 때의 데이터 타입과 다를 경우, 타입에러가 발생한다.
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %s", bool);

        // 변수 선언
        int age;
        // 변수 초기화
        age = 1;

        // 문자 - 기본형 ( '' -> 캐릭터 타입)
        char ch = 'a';
        // 문자열 - 참조형 ( "" -> 스트링 타입)
        String str = "a";

        // 상수
        final String USER_NAME = "길동이";

        // underscore 표기법 -> 컴퓨터는 그냥 읽지만 개발자의 편의를 위함
        int num = 1_020_304_010;

        // 두 변수의 값을 스와핑 해보자.
        int swap1 = 1;
        int swap2 = 2;

        int tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

        // 데이터 타입

        // 논리형 - boolean
        boolean bool2 = true;
        // 정수형 - byte
        byte bt = -128;
        // 정수형 - short
        short sh = 32767;
        // 정수형 - int
        int integer = 2147483647;
        // 정수형 - long (반드시 가장뒤에 대문자 'L' 표기, 소문자는 숫자와 헷갈림)
        long longer = 2147483647L;
        // 실수형 - double
        double db = 3.141592;
        // 실수형 - float (반드시 가장 뒤에 'F' 표기, 소문자는 숫자와 헷갈림)
        float ft = 3.141592F;
        // 문자형 - char
        char ch1 = 'g';
    }
}
