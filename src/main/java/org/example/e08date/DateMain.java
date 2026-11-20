package org.example.e08date;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        // 현재 시간 가져오기
        // LocalDateTime.now(): 현재 시스템의 날짜와 시간을 반환하는 static 메서드
        // static 메서드: 객체를 생성하지 않고 클래스 이름으로 직접 호출할 수 있는 메서드
        // LocalDateTime: 날짜와 시간을 함께 다루는 Java 클래스로, 시간대 정보 없이 연월일과 시분초를 저장
        LocalDateTime now = LocalDateTime.now();
        // 날짜 직접 지정
        LocalDateTime targetDate = LocalDateTime.of(2026, Month.NOVEMBER,1,11,30,40);

        // 1. Java 기본 형식 (ISO 8601) - ISO 표쥰 시계열 문자열 -> 날짜 객체
        // Parsing(파싱): 문자열 등의 데이터를 정해진 규칙에 따라 분석하고 해석하는 과정
        // 여기서 T는 Time을 뜻한다
        LocalDateTime parsedDate1 = LocalDateTime.parse("2026-11-01T11:30:12");

        // 2. 사용자 지정 형식 (Custom) - ISO 표준 시계열 이외의 문자열 -> 날짜 객체 (포맷터를 이용)
        // MySQL에서 db의 date양식이 ISO형식이 아닌 "yyyy-MM-dd HH:mm:ss" 형식으로 오기 때문에
        // 해당 포맷이라는 것을 인지시켜준다
        String date = "2026-11-01 11:30:12";
        // 28,29번 라인은 나중에 프레임워크가 알아서 변환해준다
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate2 = LocalDateTime.parse(date, dateTimeFormatter);

        // DateTimeFormatter: Java에서 날짜와 시간의 형식을 지정하고, 그 형식에 맞춰 문자열을 변환하거나 해석하는 클래스
        // 기본 ISO 형식이 아닌 문자열은 DateTimeFormatter로 형식을 지정해 변환 가능
        // LocalDateTime.parse():문자열을 날짜·시간 객체로 변환
        // ofPattern(): 날짜와 시간의 형식(패턴)을 지정하여 DateTimeFormatter 객체를 생성하는 static 메서드

        // 출력
        System.out.println(now); // 2026-11-20T15:02:10.248126900
        System.out.println(parsedDate1); // 2026-11-01T11:30:12
        System.out.println(parsedDate2); // 2026-11-01T11:30:12

        // 데이터 타입만 다르고 위의 형식들과 같다
        LocalDate now2 = LocalDate.now();
        System.out.println(now2);
        // DateFormat 연,월,일 가져오는 포매터

        // ============================================================

        // 날짜 계산
        LocalDateTime addOneDayFromNow = now.plusDays(1L); // plus가 Long type이라 L을 붙여줌
        // 원본이 아니라 카피본을 만들어 그 카피본을 변경하여 반환한다
        System.out.println(now);
        System.out.println(addOneDayFromNow);

        // 불변 객체(Immutable Object): 생성된 이후 내부 상태를 변경할 수 없으며,
        // 변경된 값이 필요하면 새로운 객체를 생성하는 객체

        // LocalDateTime은 불변 객체이므로 plusDays(), minusMonths() 등의 메서드는
        // 기존 객체를 변경하지 않고 새로운 객체를 반환

        // 상대적인 날짜 계산 (TemporalAdjusters)
        // 해당 달의 첫번째 날
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
        // 출력 결과) 2026-11-01T15:58:13.294863400

        //해당 달의 마지막 날
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfMonth);
        // 출력 결과) 2026-11-30T16:00:36.747127600

        // 달의 첫번째 주의 목요일
        System.out.println(firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        // 출력 결과) 2026-11-05T16:08:25.756624

        //=============================================================

        // 두 날짜 비교 ================================================
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025, 9, 10);
        System.out.println(d1.isBefore(d2)); // false -> d1이 d2보다 과거인가?
        System.out.println(d1.isAfter(d2)); // true -> d1이 d2보다 미래인가?
        System.out.println(d1.isEqual(d2)); // false -> d1이 d2와 같은 날인가?
        // if문에서 단순 비교할 때는 위와 같이 하지만
        // 디테일하게 몇일 차인지 확인할 때는 period라는 객체를 이용해야한다

        // Period 객체: 두 날짜의 연/월/일을 단위로 분해해서 각각의 차를 구하는 객체
        // 저장할 공간
        Period p1 = Period.between(d1, d2);
        System.out.println(p1.getYears()); // 년도의 차이를 비교 / 출력 결과) -1

        // Math.abs():  Java에서 숫자의 절댓값(Absolute Value)을 반환하는 static 메서드
        // -1년이라는 건 없으니 절대값으로 가져온다
        System.out.println(Math.abs(p1.getYears())); // 출력 결과) 1
        System.out.println(Math.abs(p1.getMonths())); // 출력 결과) 2
        System.out.println(Math.abs(p1.getDays())); // 출력 결과) 10

        // ChronoUnit 객체
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(untilDays); // 출력 결과) -436
        // 음수로 나오기때문에 필요에 따라 아래와 같이 절대값으로 변경
        System.out.println(Math.abs(untilDays)); // 출력 결과) 436

        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);
    }
}
