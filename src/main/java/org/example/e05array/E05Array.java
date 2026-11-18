package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        // cosnt arr = [1, 2, 3]; <- JS에서의 배열
        // 배열을 생성한 후 값을 하나씩 대입
        int[] arr = new int[3]; // 길이 3의 인트 배열을 생성 및 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // 배열을 생성하면서 값을 직접 지정
        int[] arr2 = {1, 2, 3}; // 각 요소에 값을 따로 대입할 필요 X

        // 배열을 출력하는 방법
        System.out.println(Arrays.toString(arr));
        // Java가 제공해주는 Arrays객체를 사용
        // toString: 데이터를 문자열 형태로 표현해서 반환하는 메서드

        // 배열의 복사
        int[] originArr = {1, 5, 9};
        int[] copyArr = originArr;
        copyArr[0] = 999;

        // System.arraycopy() 이용해서 깊은 복사
        int[] originArrSystem = {1, 2, 3};
        // 참조하는 배열의 길이를 반환, 카피본에서의 길이를 늘릴 수 있으니 넉넉하게 * 2
        int[] copyArrSystem = new int[originArrSystem.length * 2];
        System.arraycopy(
                originArrSystem,
                0,
                copyArrSystem,
                0,
                originArrSystem.length
                );
        copyArrSystem[0] = 999;

        // Arrays.copyof() 이용해서 깊은 복사
        int[] originArrArrays = {1, 2, 3};
        // int[] copyArrArrays = new int[originArrArrays.length * 2]; // 이게 덮어씌워지니 의미가 없어진다
        // copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length);
        int[] copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length); // 이게 정석
        copyArrArrays[0] = 999;

        // 직접 구현해보자
        int[] originFor = {1, 2, 3};
        int[] copyFor = new int[originFor.length * 2];

        // 기존 for문 작성방식은 아래와 같다
        // for (int i = 0; i < originArr.length; i++) {
        //     copyFor[0] = originFor[0];

        // 인덱스를 자체적으로 가져올 수 없어서 외부에 인덱스를 선언 및 초기화하여 사용한다
        int idx = 0;
        for(int val : originFor) {
            copyFor[idx] = val;
            idx++;
        }

        // 다차원 배열
        int[][] multiArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(multiArr[1][1]);

        // 배열의 API
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};

        // 배열의 길이
        System.out.println(arr3.length);

        // 배열이 같은지 비교
        // 주소값이 아니라 배열 안에 저장된 값이 같은지 비교하는 것
        System.out.println(Arrays.equals(arr3, arr4));

        // Arrays.deepEquals(arr1, arr2): 다차원 배열의 비교
        int[][] deepArr1 = {{1,2,3},{4,5,6}};
        int[][] deepArr2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepEquals(deepArr1, deepArr2));

        // Arrays.sort(arr): 배열의 정렬
        // 원본도 정렬이 된다
        int[] sortArr = {45, 85, 3, 40, 2, 3};

        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));

    }
}
