package aray;

public class ArayCappy {
	public static void main(String[] args) {
		System.out.println("int 형 배열 복사");
		int[] dest3 = {1,2,3,4,5};
		int[] target3 = new int[3];
		System.arraycopy(dest3, 0, target3, 0, 2);
		for (int i = 0; i < target3.length; i++) {
			System.out.println((i+1)+"\t");
		}
		
		System.out.println();
		System.out.println("char 행 배열 복사");
		char[] dest2 = {'b','l','a','c','k','c','o','f','f','e'};
		char[] target2 = new char[6];
		System.arraycopy(dest2, 5, target2, 0, 6);
		System.out.println(new String(target2));
		
		System.out.println("String 형 배열 복사");
		String[] dest = {"ab","cd","bc"};
		String[] target = new String[2];
		System.arraycopy(dest, 1, target, 0, 2);
		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i]+"\t");
		}		
	}
}
