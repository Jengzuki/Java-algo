package loop;

import java.util.Scanner;

/**
 * @file_name : ContinueSearch.java
 * @author : apfl1@naver.com
 * @date : 2015. 9. 25.
 * @Story : continue를 이용한 간단한 검색엔진 원리 이해
 */
public class ContinueSearch {
	/**
	 * 검색어 [동해]가 존재하는 지 여부 체크 
	 */
	public static void main(String[] args) {
		String dest = "동해물백두산";
		int max = 0;
		boolean isExist = false;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("검색어를 입력하세요. 종료하려면 q을 눌러주세요");
			String search = scanner.next(); //백두
			if (search.equals("q")) {
				return;
			} 
			isExist = false;
			max = dest.length() - search.length(); // 검색어를 뺀 회전수는 의미없다.
			System.out.println(max);
			test: for (int i = 0; i <= max; i++) { 
				int serchCount = search.length(); 
				int deststartPoint = i; // 검색을 마친 후 다음 검색대상 낱말의 위치 
				int searchstarPoint = 0;
				// 동해물백두산
			while (serchCount -- != 0) {
				if (dest.charAt(deststartPoint++) != search.charAt(searchstarPoint++)) {
					continue test;
					}
				}
			isExist = true;
			break test;
		}
			System.out.println(isExist?"검색어["+search+"]존재함":"존재하지 않음");
		}
	}
}


/**
 *  29 : 문법 용어로 "라벨" 이라고 부르며, C언어의 GOTO문의 태그값에 해당한다. 
 *  break와 continue 는 구문 밖으로만 가는 거지만 구문과 구문이 쌓여있을 경우에 라벨을 사용.
 *  41 : 삼향연산자 (조건문) ? true : false ;   => if - else .
 *  if - else 는 안드로이드로 가면 if - else 대신 조건이 많으면 swichi로 가고 하나면 삼향연산자를 사용
 *  
 */
