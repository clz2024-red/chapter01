package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {

		int[] lottoNoArray = new int[6];
		
		for(int i=0; i<lottoNoArray.length; i++) {
			lottoNoArray[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<lottoNoArray.length; i++) {
			System.out.println(lottoNoArray[i]);
		}                                                       
                                                           
		
	}

}
