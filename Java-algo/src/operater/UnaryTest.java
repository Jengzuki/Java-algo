package operater;
/**
 * 
 * @file_name : UnaryTest.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 단향 연산자 예제
 */
public class UnaryTest {
	public static void main(String[] args) {
		/**
		 * 문제 : 정수형 변수 x = 5, y = 10, z = 0 일때
		 */
		int x = 5, y = 10 , z = 0;
		// z = x후위 + x 전위 + y후위 식을 연산자를 사용해서 완성하고
		// z 의 결과값을 출력하시오. 그리고 그 이유를 설명하시오.
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(y++);
		z = (x++)+(++x)+(y++);
		
	}

}
