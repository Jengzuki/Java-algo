package loop;

import java.util.Scanner;

/**
 * @file_name : ForLookTenSum.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1 ~ 10 의 요소의 합 구하기
 */
public class ForLookTenSum {
	/**
	 * to. 개발자님
	 * 교수님이 1부터 원하는 숫자까지 합을 구하는 프로그램이 필요하답니다.
	 * 합을 구하는 프로그램을 완성해주세요.
	 * 힌트 : 3 + 1 = 4
	 * 3 += 1;
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input=0,sum=0;
		System.out.println("입력해주세요");
		int a = scanner.nextInt();
			for (int i = 1; i <= a; i++) 	sum += i; {
			}
		System.out.println("1부터" + a + "까지의 합" + "="+sum);
		
	}
}