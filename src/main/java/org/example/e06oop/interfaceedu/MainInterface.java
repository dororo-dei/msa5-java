package org.example.e06oop.interfaceedu;

public class MainInterface {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();
        System.out.println(flyingFish.flying());

        Whale whale = new Whale();
        System.out.println(whale.residence());

        Fish fish = new FlyingFish();



        // 추상 클래스와 인터페이스는 직접 인스턴스화할 수 없으므로,
        // 이를 상속하거나 구현한 구체 클래스(구현체)를 통해 객체를 생성해야 한다

        // 내가 무언가를 상속받거나 구현하고 있다?
        // 이때 직접적으로 인스턴스 못하기 때문에
        // 상속하거나 구현체를 통해 생성이 가능한데,

        // 그 조건이 추상클래스는 상속기능,
        // 인터페이스는 구현 기능을 이용하여
        // 인스턴스화 시켜서 하위 클래스를 구현체라고 한다.

    }
}
