package chap04.sec04;

public class SumFrom1To100Example {
	public static void main(String [] args) {
		int sum=0;
		for (int i=0; i <101; i++) {
			sum = sum + i;
		}
		System.out.println("1~100 합 : " + sum);
	}
}
