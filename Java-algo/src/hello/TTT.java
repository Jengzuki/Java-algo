package hello;

import java.util.Scanner;

/**
 * 
 * @file_name : TTT.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 16.
 * @story     :
 */
public class TTT {
	
	public static void main(String[] args) {
		final double TAX_RATE = 0.097;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner.next();
		System.out.println("연봉을 입력해주세요");
		int salary = scanner.nextInt();
		int tax = (int)(salary * TAX_RATE);
		System.out.println("연봉 "+salary+"만원을 받으시는 "+name+"님께서 납부할 세금은 "+tax+"만원입니다.");
	
	}
}
