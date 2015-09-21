package aray;

import java.util.Scanner;

/**
 * @file_name : ArrayTen.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : int 타입 배열 요소의 합
 */
public class ArrayTen {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		//int[] arr = new int[5];
		//arr[0] = 1;
		//arr[1] = 2; 
		//arr[2] = 3; 
		//arr[3] = 4; 
		//arr[4] = 5; // 20년전 문법
		//int[] arr = (1,2,3,4,5); 
		int[] arr = new int[3];
		 for (int i = 0; i < arr.length; i++) {
			System.out.println("점수입력");
			 arr[i] = scanner.nextInt();
			}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t ");
			
		}
		
	}
}
