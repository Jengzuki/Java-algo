package comparison;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @file_name : SwichTest3.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 스테틱으로 만든 사칙연산 계산기 만들기
 */
public class StaticCalcMain {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자 두개입력하세요.");
			
		//	StaticCalc calc = new StaticCalc();
		//	 타입 인스턴스 = new 생성자....
		//	calc.plus(scanner.nextInt(), scanner.nextInt()); 인스턴스 방식으로 접근해서 경고메시지가 발생
			System.out.println(StaticCalc.plus(scanner.nextInt(), scanner.nextInt()));
		// =	Collections.max(3);
		// =	Arrays.sort(a);			
		// =	Math.random();
		}
}

class StaticCalc{
		static int result = 0; //멤버변수 중에서 클래스 변수
		public static int plus(int a, int b){ //static을 주나 안주나 해결방법은 같음, 매개변수 = 파라미터 = 매변, 다만 파라미터는 초기화할 필요가 없다.
			return a+b;
		}
		public static int minus(int a, int b){ 
			return a-b;
		}
		public static int multi(int a, int b){ 
			return a*b;
		}
		public static int divide(int a, int b){ 
			return a/b;
		}
}