package aray;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;


/**
 * @file_name : Money.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money3 {
	 /**
	  * 예를 들어서 134,530 이면 
	  * 거스름돈을 화폐로 표시해주면 5만원 2, 1만원 3....
	  * 표시 
	  */
	public static void main(String[] args){ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int mok = 0; //화폐단위 갯수
		int mng = 0; // 금액 = 몫 " 화폐단위		
		for (int i = 0; i < moneyUnit.length; i++) {
			mok = money / moneyUnit[i]; 
			mng = money % moneyUnit[i]; 
			money = mng;
			
			System.out.println(moneyUnit[i]+"원 : "+ mok);
		}
		
				
				
				
	}
}