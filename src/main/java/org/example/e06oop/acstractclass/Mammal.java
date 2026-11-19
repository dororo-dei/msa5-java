package org.example.e06oop.acstractclass;

public abstract class Mammal {
    protected String name;
    protected String residence;

    /**
     *
     * @return
     * 아라라
     */
    public String breath(){
        return String.format("%s이/가 숨을 쉽니다", this.name);
    }

    // 추상 클래스를 만들었다면 하나 이상의 추상 메소드가 있어야 한다.
    // 추상 메소드: 상속 관계에서 자식 클래스에게 특정 기능을 반드시 구현하도록 강제하는 메소드
    // 특징: 1. abstract추가 2. 선언문만 (구현문 X)
    /**
     * @return
     * 해당 메소드는 반드시 사는 곳을 출력하기 위해 문자열을 반환하는 작업을 해라
     */
    public abstract String Living();
}
