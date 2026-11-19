package org.example.e06oop.interfaceedu;

class Whale extends Mammal implements Swim {
    Whale(){
        super("고래","바다");
    }

    @Override
    public String residence() {
        // 부모꺼에 있는 field를 내가 쓰겠다라는 의미로 this 대신에 super 사용
        // this를 쓰기도함
        // super.name: 	부모 클래스에서 상속받은 필드에 접근
        // 관습적으로 상속 관계에서의 필드는 동명으로 하지 않는다 (유지보수 어려움)
        return String.format("%s이/가 %s에 삽니다.", super.name, super.residence);
    }

    public String swimming(){
        return String.format("%s이/가 헤엄칩니다.", super.name);
    }
}
