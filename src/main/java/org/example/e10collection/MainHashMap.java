package org.example.e10collection;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        // K: key V: value
        // 다형성을 편하게 이용하기 위하여 Map 사용
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("age", 20); // key, value순으로 넣는다
        hashMap.put("price",10000);
        hashMap.put("price", 20000); // 기존에 있던 값을 덮어씌운다

        System.out.println(hashMap.get("age"));
    }
}
