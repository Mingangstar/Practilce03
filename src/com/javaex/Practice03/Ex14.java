package com.javaex.Practice03;

import java.util.Scanner;

public class Ex14 {
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("숫자를 입력하세요: ");
	        int number = scanner.nextInt();

	        int sum = 0;
	        StringBuilder expression = new StringBuilder();
	        for (int i = 1; i <= number; i++) {
	            sum += i;
	            if (i != 1) {
	                expression.append("+");
	            }
	            expression.append(i);
	        }
	        System.out.println(expression.toString());
	        System.out.println("합계: " + sum);
	        
	        scanner.close();
	    }
		
}