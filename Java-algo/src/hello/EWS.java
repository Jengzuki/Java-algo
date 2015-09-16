package hello;

import java.util.Scanner;

public class EWS {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
	 * 이름과 연봉을 입력받아서 
	 * 연봉 **만원을 받으시는 xxx님께서 납부할 세금은 ???만원입니다. 
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔 때 마다 변하니, 
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요.
	 * 현 정권은 세율이 9.7프로라고 합니다.
	 */
		public static void main(String[] args) {
			// 지역변수 초기화 : 변수값의 그 타입에 맞는 기본값을 할당하는 것 
			// 단, 스캐너로 입력받을시 생략가능.
			int salary, tax;
			Scanner scanner = new Scanner(System.in);
			System.out.println("이름을 입력해주세요.");
			final int TEX_RATE = (int) 0.098;
			String name = scanner.next(); 
			System.out.println("연봉을 입력해주세요.");
			salary = scanner.nextInt();
			final double T = 0.098;
			tax = (int) (salary * T); //(다운) 캐스팅 실수형(소수점) -> 정수형 
			System.out.println("연봉 "+salary+"만원을 받으시는 "+name+"님께서 납부할 세금은 "+(int) (salary * T)+"만원입니다.");
		}
}
