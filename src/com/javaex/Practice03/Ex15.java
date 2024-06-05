package com.javaex.Practice03;


import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
		int x = 1;
		while (x <= num) {
			if (num % x ==0)
			System.out.println(x);
			x = x + 1;
		}
			
		}

	}


	