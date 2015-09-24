package loop;
/**
 * 
 * @file_name : ForLoopTen.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 1부터 10까지 정수의 나열 -> 수학
 */
public class ForLoopTen {
	/**
	 * for loop 의 장점
	 * 초기화, 한계값(limit)설정, 증감값 설정을
	 * 한 컨디션 내부에서 일괄 설정하므로
	 * 가독성이 줄고 코딩이 빠르게 진행한다.
	 * 따라서, while loop 보다 권장한다.
	 */
	/**
	 * To. 개발자님
	 * 1 부터 10까지 수를 출력하는 프로그램을 개발해 주세요.
	 */
	public static void main(String[] args) {
		// for (초기화(이니셜라이즈,initialize);, 한계값(limit), 증감값)
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+"\t");
			
			
			
		}
		
	}
}
