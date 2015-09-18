package comparison;

import java.util.Scanner;

/**
 * 
 * @file_name : Test1.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 18.
 * @story     :
 */
public class Test1 {
	/**
	 * To. 개발자님 프로그램을 하나 개발해야 합니다.
	 * 교수는 3명의 이름과 과 학생 평균을 입력하면 1등을 알려주는 기능을 추가해
	 * 달랍니다. 오더는 다음과 같이 화면에 출력하라고 합니다. 
	 * 1등 : 김유신 
	 * 단) 학생은 총 3명입니다. 그리고 평균점수는 0이상 100이하입니다. 
	 * 교수가 실수로 120점이라든지 하는 범위 밖 점수를 입력하면
	 *  "다시 입력하세요"하고 말해주시길 바랍니다.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 학생 이름을 입력하세요");
		String name1 = scanner.next();
		System.out.println("첫번째 학생의 평균을 입력하세요.");
		int gen1 = scanner.nextInt();
		 if (gen1 < 0 || gen1 > 100) {
			System.out.println("다시 입력해주세요."); return;
		}
		 System.out.println("두번째 학생 이름을 입력하세요");
			String name2 = scanner.next();
			System.out.println("두번째 학생의 평균을 입력하세요.");
			int gen2 = scanner.nextInt();
			 if (gen2 < 0 || gen2 > 100) {
				System.out.println("다시 입력해주세요."); return; 
			 }
		System.out.println("세번째 학생 이름을 입력하세요");
		String name3 = scanner.next();
		System.out.println("세번째 학생의 평균을 입력하세요.");
		int gen3 = scanner.nextInt();
			if (gen3 < 0 || gen3 > 100) {
			System.out.println("다시 입력해주세요."); return; 
				 }
			
		if (gen1 > gen2 && gen1 > gen3) {
			System.out.println("1등은"+name1+"입니다.");
		} else if (gen2 > gen3) {
			System.out.println("1등은"+name2+"입니다.");
		} else {
			System.out.println("1등은"+name3+"입니다.");

		}

		}
	}

