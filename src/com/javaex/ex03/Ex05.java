package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int point = sc.nextInt();
		
		if(point%3==0) { //3의 배수일때
			System.out.println(point + "는 3의 배수입니다.");
		
		}else { //3의 배수가 아닐때
			System.out.println(point + "는 3의 배수가 아닙니다.");
		
		}
		
		sc.close();
	}

}
