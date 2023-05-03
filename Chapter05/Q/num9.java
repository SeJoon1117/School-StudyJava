package chap05.Q;

import java.util.Scanner;
public class num9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int big=0, num=0, sum=0;
			double arg;
			int []score = null;
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			int i = scan.nextInt();
			if(i==1) {
				System.out.print("학생수> ");
				num = scan.nextInt();
			} else if(i==2) {
				score = new int[num];
			} else if(i==3) {
				for(int r=0;r<score.length;r++) {
					System.out.println("score["+i+"]:"+score[i]+"\n");
				}
			} else if(i==4) {
				for(int r=0;r<score.length;r++) {
					sum = sum + score[i];
					if(big<score[i]) {
						big=score[i];
					}
					arg = (double)sum/score.length;
					System.out.println("최고 점수:" + big);
					System.out.println("평균 점수:" + arg);
				}
			} else if(i==5) {
				System.out.println("프로그램 종료");
				break;
			}	
		}
	}
}
