package org.example.e11enum;

public enum Weeks {
    // Enum: 상수의 집합을 편리하게 선언하고 사용하기위해 만든 객체
    // 공통성있는 상수 묶어두기

    // Type-safe(타입 안전)
    // 정해 둔 자료형에 맞는 값만 사용하도록 확인해,
    // 타입 때문에 생기는 실수를 막는다는 뜻
    MONDAY("월요일", 1), // 0부터 숫자 매겨지는데 이를 ordinality
    TUESDAY("화요일", 2),  // 근데 순서성은 x
    WEDNESDAY("수요일", 3), // 연산용도로 사용 x
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 7);

    private  final String krDay;
    private final int dayNum;

    Weeks(String krDay, int dayNum){
        this.krDay = krDay;
        this.dayNum = dayNum;
    }

    // Getter Method

    public int getDayNum() {
        return dayNum;
    }

    public String getKrDay(){
        return this.krDay;
    }

}
//     public final static String MONDAY = "월요일";
//     public final static String TUESDAY = "화요일";
//
//     public static String convertKrtoEn(String day) {
//         switch (day) {
//             case Weeks.MONDAY:
//                 return "MONDAY";
//             case Weeks.TUESDAY:
//                 return "TUESDAY";
//             default:
//                 return "";
//         }
//     }

