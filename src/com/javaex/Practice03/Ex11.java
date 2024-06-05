package com.javaex.Practice03;


import java.util.Scanner;

public class Ex11 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("숫자를 입력하세요: ");
	        int number = scanner.nextInt();
	        
	        int sum = 0;
	        if (number % 2 == 0) { // 입력 값이 짝수인 경우
	            for (int i = 2; i <= number; i += 2) {
	                sum += i;
	            }
	            System.out.println("결과값: " + sum);
	        } else { // 입력 값이 홀수인 경우
	            for (int i = 1; i <= number; i += 2) {
	                sum += i;
	            }
	            System.out.println("결과값: " + sum);
	        }
	        
	        scanner.close();
	    }
    }
