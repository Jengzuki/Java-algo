package operater;
/**
 * 
 * @file_name : OpCode.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 연산자 문법
 */
public class OpCode {
	public static void main(String[] args) {
		/**
		 *  && : 둘 다 참일 때 실행 (교집합
		 *  || : 둘 다 하나만 참이여도 실행 (합집합
		 */
		int a, b, c; // data 타입이 동일한 변수를 선언할 때 묶음처리 가능
		a = b = 10;
		c = a + b;
		System.out.println("결과 값 :"+c);
		}
}
