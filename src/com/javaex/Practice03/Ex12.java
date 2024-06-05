package com.javaex.Practice03;

import java.util.Scanner;

public class Ex12 {
	//잘 모르겠음 gpt 참조
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("숫자를 입력하세요: ");
	        int number = scanner.nextInt();
	        
	        long factorial = calculateFactorial(number);
	        
	        System.out.println(number + "의 팩토리얼: " + factorial);
	        
	        scanner.close();
	    }
	    
	    // 팩토리얼 계산 메서드 (공식과 for 루프 사용)
	    public static long calculateFactorial(int n) {
	        long factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
   
}
