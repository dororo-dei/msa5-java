package org.example.e14record;

// 1. record로 만들면 아래와 같디
public record EduRecord(
        String name,
        int age
) {} // method가 필요없어서 개행 x (취향대로)

// 2. class로 만들면 아래와 같다

// public class EduRecord {
//     private final String name;
//     private final int age;
//
//     // final을 사용했으니 초기화를 해줘야함
//
//     public EduRecord(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     // 외부에서 읽을 수 있도록 getter사용
//     // generate 사용
//     // get이라는 이름으로 필드명을 붙여서 만든다
//
//     public String getName() {
//         return name;
//     }
//
//     public int getAge() {
//         return age;
//     }
// }