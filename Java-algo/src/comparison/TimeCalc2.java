package comparison;

import java.util.Scanner;

/**
 * @file_name : TimeCalc.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 입력된 시간(초)를 시간, 분, 초로 환산하기
 */
public class TimeCalc2 {
	/**
	 * to. 개발자님께
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 계속 계산해야 합니다.
	 * 혹시 초 값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	 * 그러니까 500초 이면 몇시간 몇분 몇초라고 보여주면 좋겠죠.
	 */
		public static void main(String[] args) {
		int sec = 0, min = 0, hour = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력해주세요.");
			sec = scanner.nextInt();
			min = (sec / 60) % 60;
			hour = (min / 60) % 60;

			System.out.println(hour+"시간 "+min+"분 "+sec+"초");
			
		}

}
