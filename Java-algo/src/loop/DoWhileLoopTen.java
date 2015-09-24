package loop;
/**
 * @file_name : Account.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 24.
 * @Story	  : do - while loop 문법
 */
import java.util.Scanner;

public class DoWhileLoopTen {
	public static void main(String[] args) {
		int i = 0;  
		
		do{
			i++;
			System.out.print(i+"\t");
		} while (i<10);
}
}