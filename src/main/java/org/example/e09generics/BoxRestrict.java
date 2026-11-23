package org.example.e09generics;

public class BoxRestrict<T extends App & Goods> {
    // 제네릭(Generic) 타입 범위 한정
    // Tv, Mobile 만 가능하게 하고싶다 -> App에게 상속받는다는 공통점 있음
    public T media;

}
