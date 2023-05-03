package chap05.Q;

public class num7 {
	public static void main(String[] args) {
		int [] array= {1,5,3,8,2};
		int big=0;
		for(int i=0;i<array.length;i++) {
			if (big < array[i]) {
				big = array[i];
			}
		}
		System.out.println(big);
	}
}
