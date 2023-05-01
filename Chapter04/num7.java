package chap04.Q;

import java.util.Scanner;

public class num7 {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n,sum=0;
		while(true) {
			System.out.println("--------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			String str = scan.nextLine();
			if (str.equals("1")) {
				System.out.print("예금액>");
				n = scan.nextInt();
				sum = sum + n;
				continue;
			}
			else if (str.equals("2")) {
				System.out.print("출금액>");
				n = scan.nextInt();
				sum = sum - n;
				continue;
			}
			else if (str.equals("3")) {
				System.out.print("잔고>");
				System.out.print(sum);
				System.out.println();
				continue;
			}
			else if (str.equals("3")) {
				System.out.print("프로그램 종료");
				break;
			}
		}
	}
}