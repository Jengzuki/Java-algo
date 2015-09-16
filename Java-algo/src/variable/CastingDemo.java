package variable;
/**
 * 
 * @file_name : CastingDemo.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 캐스팅 문법
 */
public class CastingDemo {
	public static void main(String[] args) {
		/**
		 *  형변환(type corversion) 데이터를 다른 종류의 상자로 옮기는 것 
		 *  형변환은 자동(=묵시적) 형변환과 수동(=명시적) 형변환으로 나뉜다.
		 *  자동 형변환을 보통 promotion 이라고 하고
		 *  수동(명시적) 형변환을 [down]casting 이라고 한다.
		 *  
		 *  프로그램 = 데이터(변수+상수) = 로직(=구문)
		 *  알고리즘 = 변수 + 구문(statement)
		 *  
		 *  프로그램에서 데이터 타입이 큰 변수(64bit)을 데이터 타입이 작은 변수(32bit)로
		 *  할당하려 할때(long a = 12345) 명시적으로 타입을 저장하는 것
		 *  다만, 데이터의 손실이 발생함.
		 *  개발자는 직접 다운캐스팅을 하지 않고, 이클립스를 통해 자동으로 add Cast 한다.
		 *
		 *  
		 */
		int a;              //선언
		a = 7;              //할당
		int b = 8;          //선언과 동시에 할당 => 할당  정수는 인트
		double d = 3.14d;   //64bit
		float f = 3.14f;    //32bit
		//a = (int)d;
		a = (int) d;
		System.out.println("다운캐스팅 결과 : "+a);
		
	}
}
