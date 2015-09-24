package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopddEvenSum.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열을 입력한 값과 값에서의 요소의 홀수합, 짝수의 합 따로 구하기
 */
public class ForLoopddEvenSum {
	/**
	 * to. 개발자님
	 * 교수님이 원하는 수부터 원하는 숫자까지 합을 구하는 프로그램이 필요하답니다.
	 * 홀수는 홀수끼리, 짝수는 짝수끼리 더하는 프로그램을 만들어주세요.
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input1 = 0,input2=0,smoll=0,big=0, sum=0;
		System.out.println("입력해주세요");
		input1 = scanner.nextInt();
		input2 = scanner.nextInt();
		
		int evenSum =0;
		int oddSum =0;
		
		if (input1 < input2) {
			smoll = input1;
			big = input2;
			 
		}
		else {
			smoll = input1;
			big = input2;
			}
		
		for (int i = smoll; i <= big; i++)  {
				if (i%2==0) {
					 evenSum += i;
				} else {
					oddSum += i;
				}
					} 
		
		/*for (int i = smoll; i < big; i+=2)  {sum+=i;
		if (i%2 == 0) {
			evenSum += i;
			
		} else {
			for (int j = smoll; j < big; j+=2)  sum+=j;{
			oddSum +=i;
			}
			for (int j = smoll; j < big; j+=2)  sum+=j;{
				evenSum +=i;
				
			
		}*/
		System.out.println(smoll+"부터"+big+"까지 짝수의 합 = "+ evenSum);
		 System.out.println(smoll+"부터"+big+"까지 홀수의 합 = "+ oddSum);
		// System.out.println(smoll+"부터"+big+"까지 합 = "+sum);
		
	}
}
	