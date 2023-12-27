package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목번호: ");
		int code = sc.nextInt();
		
		//String code = new String("A");
		
		if(code == 1 ) {
			System.out.println("R101호");
		
		}else if( code == 2){
			System.out.println("R202호");
		
		}else if( code == 3){
			System.out.println("R303호");
		
		}else if( code == 4) {
			System.out.println("R404호");
			
		}else {
			System.out.println("상담원");
		}
		
		sc.close();
	}

}
