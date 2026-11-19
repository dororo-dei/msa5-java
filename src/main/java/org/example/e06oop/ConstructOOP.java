package org.example.e06oop;

public class ConstructOOP {
    // 생성자 (Constructor) - 메소드
    // 클래스를 인스턴스화 할 때, 최초 1회만 실행되는 메소드
    // 주로 객체의 초기화 또는 인스턴스 생성 시, 실행되어야 할 책임을 위해 사용

    private String name;
    private int age;


    // 1. 기본 생성자 (Default Constructor)
    // 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성되는 생성자
    public ConstructOOP() {
        this("무명",20);
    } // 메소드 형식과 비슷하나 return X

    // 2. 커스텀 생성자
    public ConstructOOP (String name) {
        // this(); // 기본 생성자 호출이 생략되어 있다.
        // this 참조 변수: 클래스 자기 자신을 가르킴
        // [중괄호{}안에 있는 것 중].[필드]
        this.name = name;
    }

    // 3. 매개변수가 2개인 사용자 정의 생성자
   public ConstructOOP(String name, int age) {
        this(name);
        this.age = age;
   }

}
