package operater;
/**
 * 
 * @file_name : ArtihmeticDemo3.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : [cookbook-java5.0] p.91-3 단행연산자 예제.
 */
public class ArtihmeticDemo3 {
		public static void main(String[] args) {
			int a = 10, b = 10;
			boolean c = ++a > b++ || a++ >= ++b;
			System.out.println(a+","+b);
			System.out.println("변수의 c의 값 : "+c);
		}
}
