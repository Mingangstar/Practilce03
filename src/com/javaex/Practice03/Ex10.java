package com.javaex.Practice03;


import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		//GPT 참고함 
		Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 다섯 개의 정수 입력 받기
        int[] numbers = new int[5]; // 
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers[i] = scanner.nextInt();
        }
        
        // 가장 큰 수 찾기
        int max = numbers[0]; //
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // 결과 출력
        System.out.println("최대값은" + " " + max + "입니다.");
        
        scanner.close();
    }

}