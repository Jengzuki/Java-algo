package swich;

import java.util.Scanner;

/**
 * 
 * @file_name : SwichDemo.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 스위치 문법
 */
public class SwichDemo {
	public static void main(String[] args) {
		/**
		 * 월을 입력하면 해당 월이 몇일까지인지 알려주는 프로그램을 작성하시오.
		 * 단, 2월은 윤년을 따지지 않고 무조건 29일입니다.
		 */
		
		//int month = Integer.parseInt(args[0]);
		// 리터럴 : 문자열리터럴  = " " <-요기 안
		
		int month = Integer.parseInt("4");
		System.out.println(month);
		Scanner scanner = new Scanner(System.in);
		//System.out.println("~");
		month = scanner.nextInt();
		String res = null; // 지역변수는 반드시 초기화를 해주어야 한다.
		
		
		
		switch (month) {
		case 1: break;
		case 3: break;
		case 5: break;
		case 7: break;
		case 8: break;
		case 10: break;
		case 12: break;

		default:
			break;
		}

				
	}
}
