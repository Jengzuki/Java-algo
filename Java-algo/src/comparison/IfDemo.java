package comparison;

import java.util.Scanner;

/**
 * 
 * @file_name : IfDemo.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 단일 if문 예제 
 */
public class IfDemo {
	public static void main(String[] args) {
		/**
		 * 변수명은 num
		 * 컨디션은 10 이상이면
		 * "입력한 수는 10 이상입니다."
		 * "입력한 수는 10 미만입니다."
		 */
		/**
		 * continue, break(스위치 문에서만 사용), return (스위치문을 제외한 나머지 구문에서 end)
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int num = scanner.nextInt();
		String str = "10 미만입니다.";
		if(num>10)	
		     
		{str = "10이상";}
		System.out.println(str+"");
		
		
	}	
}
