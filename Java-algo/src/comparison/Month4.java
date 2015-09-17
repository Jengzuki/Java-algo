package comparison;

import java.util.Scanner;

/**
 * 
 * @file_name : Month2.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 17.
 * @story     :
 */
public class Month4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요.");
		int month = scanner.nextInt();
		String day = null;
		// 필터링
		// 유효성 체크 validation 고급개념
		if (month>12) {
		System.out.println("존재하지 않습니다.");
		}
		else if (month<1) {
			System.out.println("존재하지 않습니다.");
		}
		else {
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			day = "31"; break;
		case 4: case 6: case 9: case 11: 
			day = "30"; break;
		case 2: 
			day = "29"; break;
		default:
		 System.out.println("에러발생");
		}
		System.out.println(month+"월은 "+day+"일 까지입니다.");
		
	}
		}
}
