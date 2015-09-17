package comparison;

import java.util.Scanner;

/**
 * 
 * @file_name : Newll.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 17.
 * @story     :
 */
public class Newll {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scanner.nextInt(); //String 타입은 입력 초기화
		System.out.println("기준값을 입력해주세요.");
		int pell = scanner.nextInt();
		if(num >= pell){
			System.out.println(num+"은(는)"+pell+"이상입니다.");
			return;
		}		
			System.out.println(num+"은(는)"+pell+"이하입니다.");
	}
}
