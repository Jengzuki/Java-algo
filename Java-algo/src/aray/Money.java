package aray;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : Money.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money {
	 /**
	  * 예를 들어서 134,530 이면 
	  * 거스름돈을 화폐로 표시해주면 5만원 2, 1만원 3....
	  * 표시 
	  */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] cou = new int[8];
		for (int i = 0; i < cou.length; i++) {
			if (i==0) {
				cou[i] = money/moneyUnit[i];
		} else {
			cou[i] = (money%moneyUnit[i-1])/moneyUnit[i];
			}
			}
		
		System.out.println("5만 : "+cou[0]+"장 1만 : "+cou[1]+"장 5천 : "+cou[2]+"장 1천 : "+cou[3]+"장 5백원 : "+cou[4]+"개 1백원 : "+cou[5]+"개 50원: "+cou[6]+"개 10원: "+cou[7]+"개");
		
	}
}