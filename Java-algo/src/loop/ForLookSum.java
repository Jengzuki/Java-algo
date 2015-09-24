package loop;

import java.util.Scanner;

/**
 * @file_name : ForLookTenSum.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열을 입력한 값과 값에서의 요소의 합 구하기
 */
public class ForLookSum {
	/**
	 * to. 개발자님
	 * 교수님이 원하는 수부터 원하는 숫자까지 합을 구하는 프로그램이 필요하답니다.
	 * 그런데, 교수님이 까다로와서 큰 수를 먼저 입력하든 나중에 입력하든 
	 * 두 수의 사이의 정수들의 합을 나오게 해달랍니다.
	 * 5부터 137까지의 합은 ??? 입니다.
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input1 = 0,input2=0,sum1=0,sum2=0, sum=0;
		System.out.println("입력해주세요");
		input1 = scanner.nextInt();
		input2 = scanner.nextInt();
		if ( input1 < input2) {
			sum1 = input1;
			sum2 = input2;	
		} else if (input2 > input1) {
			sum1 = input2;
			sum2 = input1;	
		}else {
			sum1 = input2;
			sum2 = input1;
					} 
		for (int i = sum1; i <= sum2; i++)    sum += i;
		System.out.println(sum1+"부터"+sum2+"까지의 합 ="+sum); 
		
		
	}
}