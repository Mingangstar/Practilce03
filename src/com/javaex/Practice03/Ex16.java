package com.javaex.Practice03;


import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                count++;
                sum += i;
            }
        }
        
        System.out.println("5의배수의 개수: " + count);
        System.out.println("5의배수의 합: " + sum);

        scanner.close();
    }

}