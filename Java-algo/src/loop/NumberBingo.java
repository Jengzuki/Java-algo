package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @file_name : NumberBingo.java
 * @author : apfl1@naver.com
 * @date : 2015. 10. 5.
 * @Story : 숫자맞추기 게임
 */
public class NumberBingo {
	/**
	 * 1부터 10까지 랜덤숫자를 컴퓨터가 생성하면 3회안에 숫자를 맞추는데 플레이어가 입력한 숫자가 답보다 큰지 작은지를 알려줌.
	 */
	public static void main(String[] args) {
		int com = 0, player = 0, count = 0;
		com = (int) ((Math.random() * 10) + 1);
		while (true) {
			int temp = Integer.parseInt(JOptionPane.showInputDialog("1부터 10까지 숫자만 넣으세요"));
			try {
				count++;
				if (temp == com) {
					System.out.println("맞추셨습니다.");
				}else if (temp > com) {
					System.out.println("정답보다 큽니다");
				} else if (temp < com) {
					System.out.println("정답보다 적습니다.");
				}if (count == 3) {
					System.out.println("게임의 총 횟수는 3회입니다.");
					System.out.println("정답은 "+com+"입니다.");
					return;
				}
			} catch (InputMismatchException e) {

				count--;
				continue; // 범위밖의 숫자를 입력했을때에는 카운트에서 제외해준다.
			}
		}
	}
}
