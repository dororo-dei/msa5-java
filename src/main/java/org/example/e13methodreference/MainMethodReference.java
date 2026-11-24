package org.example.e13methodreference;

import java.util.Arrays;
import java.util.List;

public class MainMethodReference {
    public static void main(String[] args) {
        // 써도되고 안써도 되는 기능
        // 람다식을 축약해서 쓰자
        List<String> list = Arrays.asList("최강재","최돌수","최비비");

        // 람다식을 이용해서 출력
        list.forEach((name)-> System.out.println(name));

        // 메소드 참조
        list.forEach(System.out::println);
    }
}
