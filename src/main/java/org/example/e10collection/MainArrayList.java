package org.example.e10collection;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        // 다형성을 이용하여 ArrayList가 List의 하위라 이런식으로 가져온다
        // 업캐스팅해서 받은 것
        // 업캐스팅: 자식 클래스의 객체를 부모 클래스 타입의 변수로 다루는 것
        List<Integer> list1 = new ArrayList<>();
        list1.add(1); // 직접 index번호를 지정하지 않아도 순차적으로 넣어진다
        list1.add(2);
        list1.add(3);

        System.out.println(list1.get(0)); // 해당 ArrayList의 index를 가져오는 것
        System.out.println(list1.size()); // 해당 ArrayList의 크기, 길이를 가져오는 것

        list1.forEach((i)->{
            System.out.println(i);
        }); // 람다식 (콜백함수와 같은 형식)
    }
}
