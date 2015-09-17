package comparison;

import java.util.Scanner;

/**
 * 
 * @file_name : Month2.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 17.
 * @story     :
 */
public class Month2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요.");
		int month = scanner.nextInt();
		String day = null;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			day = "31일 까지입니다."; break;
		case 4: case 6: case 9: case 11: 
			day = "30일 까지입니다."; break;
		case 2: 
			day = "29일 까지입니다."; break;
		default:
			day = "존재하지 않습니다.";
			break;
		}
		System.out.println(month+"월은 "+day);
		
	}
}
