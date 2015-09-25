package loop;
/**
 * @file_name : Continue3Multiple.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 25.
 * @Story	  : 3의 배수를 제외한 1부터 10까지 정수출력
 */
public class Continue3Multiple {
	/**
	 * [결과]
	 * 1 2 4 5 7 8 10  
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {
				continue; //continue = 조건에 맞으면 아래로 진행하지 말고 다시 처음에서 시작
			}
			System.out.print(i+"\t");
		}
	}
}
