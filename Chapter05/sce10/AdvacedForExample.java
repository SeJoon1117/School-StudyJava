package chap05.sce10;

public class AdvacedForExample {
	public static void main(String [] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum=0;
		
		for(int score:scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		double arg = (double)sum/scores.length;
		System.out.println("평균 = " + arg);
	}
}
