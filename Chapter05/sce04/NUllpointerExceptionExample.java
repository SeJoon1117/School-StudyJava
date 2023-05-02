package chap05.sce04;

public class NUllpointerExceptionExample{
	public static void main(String[] args) {
		int [] intArray=null;
		intArray[0] = 10; // sd
		
		String str =null;
		System.out.println("총 문자 수: " + str.length());
	}
}