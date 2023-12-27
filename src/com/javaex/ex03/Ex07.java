package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		
		int no = sc.nextInt();
		
		if(no>0) {//양수니?
			
			if(no%2==0) { //짝수니?
				System.out.println("짝수(양수)");
			
			}else { //홀수
				System.out.println("홀수(양수)");
			}
			
		}else if(no<0){
			System.out.println("음수");
		
		}else {
			System.out.println("0");
		}
		
		
		sc.close();
	}

}
