package test;

import java.util.Scanner;

/**
 * @file_name : SwichTest3.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 사칙연산 계산기 만들기
 */
public class SwichTest3 {
	/**
	 * To. 개발자님 
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
	 * 복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
	 * 몫과 나머지 값으로 출력하면 됩니다.
	 * 출력결과문은 예를들어
	 * 5 + 5 = 10
	 * 2 - 7 = -5
	 * 이렇게 되고,
	 * 30 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다. 
	 * 그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다. 
	 */
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력하세요.");
			int a = scanner.nextInt();
			System.out.println("연산자 입력하세요");
			String pe = scanner.next();
			System.out.println("입력하세요.");
			int b = scanner.nextInt();
			
			String aa = null;
			int c = (int)(a + b);
			int d = (int)(a - b);
			int g = (int)(a * b);
			int h = (int)(a / b);
			int w = (int)(a % b); // %는 나머지 값.  
			switch (pe) {
			case "+": System.out.println(a +"+"+ b +"="+ c); break;
			case "-": System.out.println(a +"-"+ b +"="+ d); break;
			case "*": System.out.println(a +"*"+ b +"="+ g); break;
			case "/": System.out.println(a +"/"+ b +"="+ h +"["+w+"]"); break;
			default:
				break;
			}							
		}
}
