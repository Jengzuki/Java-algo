package loop;

/**
 * @file_name : GuguDan.java
 * @author : apfl1@naver.com
 * @date : 2015. 9. 25.
 * @Story : 책받침 구구단
 */
public class GuguDan {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
		for (int dan = 2; dan < 6; dan++) { // 바깥쪽 for문 1회전이 끝나면 라인개행
				System.out.print(dan + "*" + i + "=" + dan * i + "\t"); 
			}System.out.println();
		}System.out.println("\n");
		for (int i = 1; i < 10; i++) {
			for (int dan = 6; dan < 10; dan++) {
					System.out.print(dan + "*" + i + "=" + dan * i + "\t");
				}System.out.println();
			}
	}
}