package test;

import java.util.Scanner;

/**
 * 
 * @file_name : IfTest2.java
 * @author : apfl1@naver.com
 * @date : 2015. 9. 17.
 * @story : 1,2,3등 구하기
 */
public class IfTest4 {
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
		System.out.println("첫번째 학생의 이름을 입력해주세요");
		String name1 = scanner.next();
		System.out.println("첫번째 학생의 평균을 입력해주세요.");
		int ang1 = scanner.nextInt();
		if (ang1 < 0 || 100 < ang1) {
			System.out.println("첫번째 학생의 점수를 확인하세요."); return;
		}
		System.out.println("두번째 학생의 이름을 입력해주세요.");
		String name2 = scanner.next();
		System.out.println("두번째 학생의 평균을 입력해주세요.");
		int ang2 = scanner.nextInt();
		if (ang2 < 0 || 100 < ang2) {
			System.out.println("두번째 학생의 점수를 확인하세요."); return;
		}
		System.out.println("세번째 학생의 이름을 입력해주세요.");
		String name3 = scanner.next();
		System.out.println("세번째 학생의 평균을 입력해주세요.");
		int ang3 = scanner.nextInt();
		if (ang3 < 0 || 100 < ang3) {
			System.out.println("세번째 학생의 점수를 확인하세요."); return;
		}
	
		 String fi = null;
		 String tw = null;
		 String th = null;
		
		if (ang1 > ang2 && ang1 > ang3 ) {
			fi = name1;
			if (ang2 > ang3) {
				tw = name2;
				th = name3;
			} else {
				tw = name3;
				th = name1;
			}			
		} else if (ang2 > ang3 && ang2 > ang1) {
			fi = name2;
			if (ang1 > ang3) {
				tw = name1;
				th = name3;
			} else {
				tw = name3;
				th = name1;
			}
		} else if (ang3 > ang2 && ang3 > ang1) {
			fi = name3;
			if (ang2 > ang1) {
				tw = name2;
				th = name1;
			} else {
				tw = name1;
				th = name2;}
		}
		 else {
		}
		System.out.println("1등은 "+fi+", 2등은 "+tw+", 3등은 "+th+"입니다.");
		
		
		
	
	}
}