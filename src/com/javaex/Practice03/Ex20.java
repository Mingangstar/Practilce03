package com.javaex.Practice03;


import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*5)+1;
		System.out.println("================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("================");
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");
		int n = scanner.nextInt();
		while (true) {
			if (n==a){
				System.out.println("맞았습니다");
				break;
			} else if (n < a){
				System.out.println(">>");
				System.out.println("더 높게");
				n = scanner.nextInt();
			} else if (n > a){
				System.out.println(">>");
				System.out.println("더 낮게");
				n = scanner.nextInt();
			}
			
		}
		System.out.print("게임을 종료하시겠습니까?(y/n) >>");
		String y;
		y = scanner.next();
			if (y == y) {
				System.out.println("=============");
				System.out.println("[숫자맞추기 게임 종료]");
				System.out.println("=============");
			}
		
	}

}