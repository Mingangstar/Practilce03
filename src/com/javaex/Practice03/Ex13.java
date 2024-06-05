
package com.javaex.Practice03;


import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        	
        	System.out.print("숫자를 입력하세요: ");
        	int number = scanner.nextInt();
        	
        	int sum = 0;
        	for (int i = 1; i <= number; i += 1) {
                sum += i;

            }
            System.out.println("결과값: " + sum);
	}
}
