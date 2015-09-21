package comparison;

import java.util.Scanner;

/**
 * @file_name : LeapYear.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 윤년 판별 프로그램
 */
public class LeapYear {
	/**
	 * 연도를 새로 나눈 값이 0이라면 윤년일 수 있다.
	 * 그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
	 * ex) 2000년은 4로 나눈값이 0이라서 윤년 일 수 있는데, 다시 이 값이 100으로 나누어 떨어지면 평년이다.
	 * 평년이라 해도 다시 400으로 나누어 떨어지는 연도는 윤년이다.
	 */
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력해주세요");
			int cal =scanner.nextInt();
		
			int foo = cal%4;
			int foo2 = foo%100;
			int foo3 = foo%400;
			
			if (foo2 == 0 || foo3 == 0) {
				System.out.println("윤년");
			} else if (foo3 > 0 ) {
				System.out.println("평년");
			} else {
				
			}
						
		}
}


