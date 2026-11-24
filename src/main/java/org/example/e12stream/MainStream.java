package org.example.e12stream;

import org.example.e06oop.Inheritance.Whale;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        // 콜렉션 프레임워크는 기본적으로 기본형을 받지 못한다
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);

        // Q. 각각의 값에 3을 더한 값을 얻고싶다.
        // stream 사용하지 않은 버전 - stream의 map이 이렇게 동작한다
        // origin은 두고 새로운 저장공간에 넣어야한다
        List<Integer> copyList = new ArrayList<>();
        list.forEach((i)->{
            copyList.add(i+3);
        });
        System.out.println(copyList);

        // for문으로 사용하는 방법
        for (int idx = 0; idx < list.size(); idx++){
            copyList.add(list.get(idx) +3);
        }

        List<Whale> whaleList = new ArrayList<>();
        whaleList.add(new Whale("핑크고래", "바다"));
        whaleList.add(new Whale("밍크고래", "바다"));
        whaleList.forEach((item)->{
            System.out.println(item.living());
        });

        // stream 사용하는 방법
        // 메서드 체이닝
        // 메서드가 반환한 결과에 또 다른 메서드를 연속해서 호출하는 작성 방식
        List<Integer> result1 = list.stream()
                .map((i)-> i + 3) // return할게 하나면 {} 생략
                .toList();
        System.out.println(result1);

        // 'list'에서 짝수의 개수를 구해주세요.
        // 1. for문 사용
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                // cnt++; 증감연산자를 사용한다면 이렇게 쓰고 산술연산자로 아래와같이 작성가능하다
                cnt += 1;
            }
        }
        long result2 = list.stream()
                .filter((i)->i % 2 == 0)
                .count();
    }
}
