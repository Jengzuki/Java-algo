package test;

import java.util.Scanner;

/**
 * 
 * @file_name : IfTest.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 성적표 프로그램
 */
public class IfTest {
	/**
	 * To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 학생이 국어, 영어, 수학 점수만 입력하면
	 * 총점, 평균, 합격,여부가 출력되는 프로그램 입니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 학생		국어		영어		수학		총점		평균		합격여부
	 *  ===========================================================================
	 *  홍길동	90			90			90			270			90			(장학생)
	 *  합격여부는 다음과 같다고 합니다.
	 *  평균이 90점 이상이면 장학생
	 *  70점 이상 90점 미만 이면 합격
	 *  70점 미만이면 불합격이라고 하세요.
	 *  단) 평균에서 소수점이하는 절삭입니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = scanner.next();
		System.out.println("국어 :");
		int kor = scanner.nextInt();
		System.out.println("영어 :");
		int eng = scanner.nextInt();
		System.out.println("수학 :");
		int math = scanner.nextInt();
		int total = (int)(kor + eng + math);
		int average =(int)(total / 3);
	    String sorf = null;
		if (average >= 90) {
			sorf = "장학생";
			System.out.println();
		} else if (average >= 70) {
			sorf = "합격";
		} else {
			sorf = "불합격";
		} 
				
		System.out.println("학생	국어	영어	수학	총점	평균	합격여부");
		System.out.println("===========================================================================");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+average+"\t"+sorf);
				
		
	}
}
