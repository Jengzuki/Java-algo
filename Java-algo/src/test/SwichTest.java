package test;

import java.util.Scanner;

/**
 * @file_name : SwichTest.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 18.
 * @story     : swicth로 성별 판별 프로그램 
 */
public class SwichTest {
	/**
	 * To. 개발자님 
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수가 주민번호를 입력하면 해당 학생이 남자인지, 여자인지, 외국인인지
	 * 자동으로 출력해 주는 프로그램을 만들어 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 홍길동 : 800101-1234567  : 남 
	 * 입력값은 이름과 주민번호이고, 성별은 자동으로 출력되는 것입니다.
	 * 현행법상 1, 3 으로 시작되면 남자. 2, 4로 시작되면 여자, 5와 6 하면 외국인
	 * 교수가 실수로 0,7,8,9 로 시작되는 주민번호를 입력하면
	 * "다시입력하세요~" 라고 알려주시길 바랍니다.
	 */
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("이름을 입력해주세요.");
			String name = scanner.next();
			System.out.println("주민번호를 입력해주세요");
			String ssn = scanner.next();
			char ch = ssn.charAt(7);
			
			String gender = null;
						
			switch (ch) {
			case '1':	case '3':
				gender = "남"; break;
			case '2':	case '4':
				gender = "여"; break;
			case '5':	case '6':
				gender = "외국인"; break;
			
			
			default:
				System.out.println(	"다시입력해주세요~");
				 return;
			}
			System.out.println(name+" : "+ssn+" : "+gender);
		}
}
 //표기법(notation) char형에는 ''를 붙인다 ex)cast'1':
 // 정수 타입 표기법  	: 1, 2, 3...
 // 실수 타입 표기법	: 1.0, 2.0, 3.0...
 // 문자 타입 표기법	: '1''2''3'...
 // 문자열 타입 표기법	: "1","2","3"