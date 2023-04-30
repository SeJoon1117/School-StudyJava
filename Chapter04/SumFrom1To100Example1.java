package chap04.sec05;

public class SumFrom1To100Example1 {
	public static void main(String [] args) {
		int sum=0,i=1;
		while(i<101) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~100 합: "+sum);

	}
}
		
