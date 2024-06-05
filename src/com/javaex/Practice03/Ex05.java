package com.javaex.Practice03;

public class Ex05 {

	public static void main(String[] args) {
		//아래의 출력결과를 예상하여 작성하세요 코드를 작성해서 예상과 맞는지 확인해 보세요
		//1
		//2
		//3
		//4
		//5
		//flag가 false가 될때까지 i값을 출력 출력 후 i=i+1  
		
			int i=1;
			boolean flag = true; //falg 오타 수정

			while(flag){
				if(i>=5) {
				flag = false;
				}
				System.out.println(i);
				i=i+1;
			}
		}
}