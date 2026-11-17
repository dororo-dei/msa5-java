package org.example.e03if;

public class E03IF {
    public static void main(String[] args) {
        // 0~100의 숫자가 아닐 경우, 입력될 경우 오작동한다.
        // 해당 현상을 아래처럼 수정하시오.
        // 0~100의 숫자가 아닐 경우, "유효한 점수가 아닙니다." 출력

//        int num = 101;
//        String grade = "";
//
//        if (num >= 0 && num <= 100) {
//            if (num == 100) {
//                grade = "A+";
//            } else if (num >= 90) {
//                grade = "A";
//            } else if (num >= 80) {
//                grade = "B";
//            } else if (num >= 70) {
//                grade = "C";
//            } else if (num >= 60) {
//                grade = "D";
//            } else {
//                grade = "F";
//            }
//            System.out.printf("당신의 점수는 %d점 입니다. <%s>", num, grade);
//        } else {
//            System.out.println("유효한 점수가 아닙니다.");
//        }

        // Switch 문
        int num =3;

        switch (num) {
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("등수 외");
                break;
        }
    }
}
