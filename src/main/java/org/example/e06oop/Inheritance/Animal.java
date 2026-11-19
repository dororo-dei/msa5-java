package org.example.e06oop.Inheritance;

public class Animal {
    // 필드 ==================================================
    protected String name;
    protected String residence;

    // 생성자 =================================================
    public Animal(String name, String residence){
        this.name = name;
        this.residence = residence;
        System.out.println("동물 생성자");
    }

    // 일반 메소드 =============================================
    public String breath(){
        return String.format("%s이/가 숨을 쉽니다.", this.name);
        // format() 콘솔에 찍는게 아니라 문자열 반환할 때 사용
    }

    public String living () {
        return String.format("%s이/가 %s에서 삽니다", this.name, this.residence);
    }
}
