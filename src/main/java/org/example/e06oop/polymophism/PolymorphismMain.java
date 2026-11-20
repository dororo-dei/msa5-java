package org.example.e06oop.polymophism;

public class PolymorphismMain {
    public static void main(String[] args) {

        // 다형성
        // 부모 클래스 타입으로 자식 클래스 타입 초기화
        Whale whale1 = new Whale();
        Mammal whale2 = new Whale();

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        // 배열: 같은 데이터타입의 요소를 순서성있게 나열하는 것
        // 배열 예시: int[] arr =

        // 다형성 이용 예시
        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Monkey();

        // 수많은 데이터를 입력할 시에는 수동으로 작성하지 않고 loop문을 이용

        // 업캐스팅: 자식클래스가 부모 클래스타입으로 캐스팅 되는 것
        // 부모클래스로 캐스팅 되면 자식클래스에 있는 멤버에는 접근 불가능
        // 멤버란? 클래스 내부에 선언된 필드(변수)와 메서드(기능)
        Mammal upCasting1 = new Whale();
        // upCasting1.swimming(); 자식클래스의 swimming() 접근 안됨

        // 다운캐스팅: 업캐스팅한 인스턴스를 다시 본인의 데이터타입으로 캐스팅하는 것
        Whale downCasting1 = (Whale) upCasting1;
        downCasting1.swimming();

        // 여기서 Whale은 클래스가아닌 데이터타입이다
        // Java에서는 클래스를 선언하면 그 클래스 이름을 하나의 데이터 타입(자료형)으로 사용가능

        // 부모클래스가 다운캐스팅할 수는 없다
        Mammal mammal = new Mammal();
        // Whale whale3 = (Whale) mammal; 컴파일로 실행하려고하면 에러남

    }
}
