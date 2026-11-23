package org.example.e09generics;

public class BoxMain {
    public static void main(String[] args) {
        Box<int[]> boxIntArr = new Box<>(new int[5]);
        Box<String[]> boxStringArr = new Box<>(new String[3]);
        Box<Integer> boxInt = new Box<>(1);

        // ===================================================
        // ★ 오토박싱과 언박싱
        // Integer a = 1; // 오토박싱
        // int b = a; // a는 Integer b는 int -> Java가 자동으로 언박싱 한 것
        // int b = a.intValue(); // 원래는 이 모습이다. 이것이 언박싱
        // ===================================================

        // BoxRestrict<Tv> boxRestrict1 = new BoxRestrict<>();
        BoxRestrict<Mobile> boxRestrict2 = new BoxRestrict<>();
        // BoxRestrict<Novel> boxRestrict3 = new BoxRestrict<>();
    }
}
