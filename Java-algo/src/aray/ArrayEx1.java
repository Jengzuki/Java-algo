package aray;
/**
 * @file_name : ArrayEx1.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 예제 4-38
 */
public class ArrayEx1 {
	 public static void main(String[] args) {
		char[] ch; //배열선언
		 ch = new char[4]; //배열생성
		 //배열 초기화
		 
		 ch[0] ='j'; ch[1]='a'; ch[2]='v'; ch[3]='a';
		 //배열 내용 출력
		 for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		 
		}
}
