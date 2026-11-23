package org.example.e09generics;

public class Box<T> {
    public T arr; // 제너릭스로 인해 필드가 int 배열로 만들어진다

    // 생성자의 목적: 객체의 인스턴스화를 할 때 초기화를 위해.
    public Box(T arr) {
        this.arr = arr;
    }
}
