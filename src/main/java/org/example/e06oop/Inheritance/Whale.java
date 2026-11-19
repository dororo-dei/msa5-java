package org.example.e06oop.Inheritance;

public class Whale extends Animal {
    public Whale  (String name, String residence){

        super(name, residence);
        System.out.println("고래 생성자");
    }

    public String swimming () {
        return String.format("%s이/가 헤엄칩니다", this.name);
    }
}
