package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		int sum = 0;
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 [0이면종료]");
		
		do {
			no = sc.nextInt();
			sum = sum + no;
			System.out.println(sum);
		}while(no !=0 );
		
		
		/*
		while(true) {
			int no = sc.nextInt();
			if(no == 0) {
				break;	
			}
			
			//더하기
			sum = sum + no;
			System.out.println(sum);
		}
		*/
		
		
		System.out.println("종료");
		sc.close();
		

	}

}
