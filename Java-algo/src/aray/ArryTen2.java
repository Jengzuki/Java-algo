package aray;

import java.util.Scanner;

public class ArryTen2 {
	/**
	 * 1부터 10까지의 합 구하기 (option : 배열)
	 */ 
	 public static void main(String[] args) {
		
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			arr[i] = i+1;
		} 
		
		for (int i = 0; i < 10; i++) {
			sum += arr[i];
		} System.out.println(sum);
	
	}
}
