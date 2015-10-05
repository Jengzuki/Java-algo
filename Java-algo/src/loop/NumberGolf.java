package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @file_name : NumberGolf.java
 * @author : apfl1@naver.com
 * @date : 2015. 10. 5.
 * @Story : 최단횟수로 숫자맞추기 게임
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0, player = 0;
		int com = (int)((Math.random()*100)+1);
		while (true) {
			System.out.println("컴퓨터의 숫자는 정해졌습니다. 1부터 100사이의 정수를 입력하세요.");
			try {
				count++;
				player = scanner.nextInt();
				if (player == com) {
					System.out.println("맞추셨습니다. 당신은 " + count + "만에 되었습니다.");
				}else if (player > com) {
					System.out.println("정답보다 큽니다.");
				}else if ( player < com) {
					System.out.println("정답보다 작습니다.");
				}
				if (player < 1 || player > 100) {
					System.out.println("1부터 100까지 정수만 입력해야합니다.");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("문자는 안됩니다.");
				continue;
			}
		}

	}
}
