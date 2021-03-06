package variable;

import java.util.Scanner;

/**
 * 
 * @file_name : Constant.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 상수 문법
 */
public class Constant {
	public static void main(String[] args) {
		/**
		 * 데이터 = 상수 = 변수
			        변수
			        int a =7;
	  	 * 상수(constant)
	  	 * 상수는 데이터 그 자체를 말하며 바꿀 수 없는 데이터를 말한다.
	  	 * 종류는 다음과 같다.
	  	 * 
	  	 * 1. 정수형 상수값 : 1, 21, 100
	  	 * 2. 실수형 상수값 : 1.314d, 2.5435f
	  	 * 3. 문자 상수값   : "a" "b"
	  	 * 4. 리터럴 상수값 : "asbv"
		 */
		
		final int ONE_HUNDRED = 100;
		final double TAX_RATE = 0.09;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scanner.next();
		System.out.println("연봉을 입력하세요");
		
		int salary = scanner.nextInt();
		int tax = (int)(salary * TAX_RATE);
		System.out.println("귀하가 내야할 세금은 "+tax+"만원 입니다.");
		final int ONE = 1;
		String str = "str";
		
		
	}
}
