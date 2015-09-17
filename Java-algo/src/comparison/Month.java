package comparison;

import java.util.Scanner;

/**
 * 
 * @file_name : Month.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 17.
 * @story     :
 */
public class Month {
	/**
	 * 월을 입력하면 해당 월이 몇일까지인지 알려주는 프로그램을 작성하시오.
	 * 단, 2월은 윤년을 따지지 않고 무조건 29일입니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾고자 하는 월을 눌러주세요.");
		String day = null;
		int month = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = "31일"; break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = "30일"; break; 
		case 2:
			day = "29일"; break;
		default:
			System.out.println("X"); return;
			
		}
		System.out.println(month+"월은 "+day+"일까지 입니다.");
		
	}
	}
