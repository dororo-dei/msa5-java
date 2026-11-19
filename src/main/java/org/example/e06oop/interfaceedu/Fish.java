package org.example.e06oop.interfaceedu;

abstract class Fish {
    protected String name;
    protected String residence;

    public Fish(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    // 추상 메서드
    // 자식클래스에 필요한 기능을 규정
    // {}없이 선언하며 자식 클래스에서 구현 / 실행 내용이 없다
    abstract String residence();

    public String birth(){
        return String.format("%s이/가 알을 낳습니다.", this.name);

    }
}
