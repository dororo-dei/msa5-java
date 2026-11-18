package org.example.e06oop;

public class MainOOP {
    public static void main(String[] args) {
        // 인스턴스화 예시는 아래와 같다
        // int[] intArr = new int[3];

        // 내가 방금 만든 Whale이라는 클래스를 인스턴스로 사용가능
        // 객체를 인스턴스화 한 후 그 주소값을 저장하고 필요한 프로퍼티나 메소드에 사용
        Whale whale = new Whale();
        FlyingFish flyingFish = new FlyingFish();


        // [데이터타입] [변수명] = [인스턴스화를 위한 new키워드] [인스턴스할 클래스];
        System.out.println(whale.name);
        whale.swimming();

        // System.out.println(Whale.age);
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.fnProtected();

        // 오버로딩 (Overloading)
        // 메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        // 메소드 시그니처: 메소드 선언문에 명시되는 파라미터 리스트
        // 메소드 시그니처만 다르면 된다. return 타입은 상관 없다.

        System.out.println();
        System.out.println(OverloadingOOP.add(1,2));
    }

}
