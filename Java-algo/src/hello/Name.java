package hello;

import java.util.Scanner;

/**
 * 
 * @file_name : Name.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 15.
 * @story     : 인풋, 아웃풋 이벤트
 */
public class Name {
	public static void main(String[] args) {
		System.out.println("안녕하십니까");
		Scanner scanner = new Scanner(System.in);
		String yaho = scanner.next();
		System.out.println(yaho);
	}
}
