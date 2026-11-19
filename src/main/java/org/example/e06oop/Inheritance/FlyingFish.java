package org.example.e06oop.Inheritance;

public class FlyingFish extends Animal {

    public FlyingFish (String name, String residence){
        // 상속 관계에서 자식이 부모쪽으로 접근할 때 사용하는 지시자
        super(name, residence);
        System.out.println("날치 생성자");
    }

    public String flying () {
        return String.format("%s이/가 날아갑니다", this.name);
    }

    // 오버라이딩(Overriding): 부모에게서 상속받은 메소드를 자식이 재정의하여 사용
    // 조건: 메소드, 파라미터, return 타입이 일치해야한다
    // @특정이름 - 어노테이션
    // 어노테이션(Annotation): 클래스, 메서드, 필드 등에 추가 정보를 제공하는 표식
    @Override
    public String living(){
        return "수정했다.";
    }
}
