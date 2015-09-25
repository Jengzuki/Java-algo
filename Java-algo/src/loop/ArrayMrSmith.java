package loop;
/**
 * @file_name : ArrayMrSmith.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 25.
 * @Story	  : 이중배열 예제
 */
public class ArrayMrSmith {
	public static void main(String[] args) {
	 String[][] names = {
			 {"Mr.","Mis.","Ms."}, //0번째 줄의 0번.
			 {"Smith","Jones","Alex"}, //1번째 줄의 1번.
			 {"Hello","hi","good-bye"}
	 };
	 // Mr.Smith
	 System.out.println(names[0][0]+names[1][0]+" "+names[2][2]);
	 System.out.println(names[0][2]+names[1][2]+" "+names[2][0]);
			 
}
}
