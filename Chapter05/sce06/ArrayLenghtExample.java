package chap05.sce06;

public class ArrayLenghtExample {
	public static void main(String[] args) {
		int[] scores = {84,90,96};
		
		int sum =0;
		for(int i=0;i<3;i++) {
			sum = sum + scores[i];
		}
		
		double avg = (double)sum/3;
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
