package chap03.sec10;

public class Condition10perationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade= (score>90)?'A' : ((score>80)?'B':'C');
		System.out.println(score + "점은 " + grade + "입니다.");
	}
}
