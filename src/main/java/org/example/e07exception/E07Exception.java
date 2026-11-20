
package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07Exception {
    // 에러(Error): 일반적으로 수습하기 어려운 심각한 오류
    // 예외(Exception): 프로그램에서 처리할 수 있는 예외 상황

    public static void main(String[] args) {
        try {
            System.out.println("트라이 시작");

            // 강제로 예외 발생 시 new 다음 작성
            throw new Exception("아아아아 에러");

            // double result = 10 / 0; // 의도적으로 오류 유발
            // System.out.println("트라이 끝");
            // throw 이후에는 실행 흐름이 중단되므로
            // 바로 아래에 실행문을 작성하면 컴파일 오류 발생

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생");

            // if문처럼 위에서부터 예외 타입을 확인한다
            // try에서 예외가 생기면 가장 먼저 있는 catch부터 확인
            // 이때 ArithmeticException 타입이면 여기서 실행 후
            // finally로 이동
            // 만약 아니라면 다음 catch를 확인

            // 예외 catch 작성 시 자식부터
            // 상위인 부모부터 작성하면 아래의 자식 catch로 이동할 수 없음

        } catch (Exception e) {
            System.out.println("캐치 시작");
            System.out.println(e.getMessage());
            System.out.println("캐치 끝");

        } finally {
            // finally는 일반적인 예외 처리 흐름에서
            // 예외 발생 유무와 관계없이 실행
            System.out.println("파이널리");
        }

        // Try-with-resources
        // 리소스 처리는 외부 파일이기 때문에 외부 파일과 연결해 둔 길을
        // 연 상태(open)로 유지해야 한다
        // 작업이 끝났다면 리소스는 사용 후 닫아줘야 한다
        // 그렇지 않으면 파일 핸들 등 시스템 자원이 계속 점유될 수 있다
        // 작업의 성공 유무와 상관없이 일단 open했으니 닫아줘야 한다
        // 따라서 기존 방식에서는 finally에서 파일을 닫아주는 작업을 해주어야 한다

        // 글로벌 스코프: Java에는 일반적인 전역 변수가 없음
        // 클래스 스코프: 클래스 내부에 선언된 필드의 유효 범위
        // 로컬 스코프: 메서드, 생성자, 블록 내부에 선언된 지역 변수의 유효 범위
        // 블록 스코프: 중괄호 안에 있는 영역에서 선언된 변수의 유효 범위

        // 기존 try-catch-finally 방식
        // try 바깥에 선언해야 finally에서도 file 변수에 접근 가능
        // 아직 파일을 열기 전이므로 null로 초기화
        FileWriter file = null;

        try {
            // [파일 접근 & 쓰기 처리]

            // 파일을 쓰기 모드로 불러오기
            file = new FileWriter("text.txt");
            file.write("안녕 자바!");

        } catch (IOException e) {
            // IOException: 파일을 읽거나 쓰는 등의 입출력 과정에서 발생하는 예외
            // IO는 Input(입력)과 Output(출력)의 약자

            e.printStackTrace(); // 상세정보 출력

        } finally {
            // [파일 닫기]

            // 작업의 성공 유무와 관계없이 파일을 닫아야 함
            // 여기서 file.close();만 단독으로 쓸 수 없다
            // close() 메서드 자체에서도 IOException이 발생할 수 있기 때문
            // IOException은 반드시 처리하거나 호출한 쪽으로 전달해야 하는 예외

            // 따라서 finally 내부에서도 try-catch문이 필요함
            try {
                // 대입 연산자 오른쪽의 new FileWriter()에서 예외가 발생하면
                // file에는 객체가 대입되지 않고 null인 상태로 남을 수 있음
                // null 상태에서 file.close()를 호출하면
                // NullPointerException이 발생하기 때문에 if문 작성

                if (file != null) {
                    file.close();
                }

            } catch (IOException e) {
                // 파일을 닫는 과정에서 발생한 예외 처리
                e.printStackTrace();
            }
        }

        // Try-with-resources 방식
        // try() 안에서 리소스를 선언하면 작업 종료 시 자동으로 닫힘
        // 따라서 파일을 닫기 위한 별도의 finally가 필요하지 않음
        // close()에서 발생하는 IOException도 catch에서 처리할 수 있음

        try (FileWriter file1 = new FileWriter("text.txt")) {
            file1.write("안녕안녕!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
