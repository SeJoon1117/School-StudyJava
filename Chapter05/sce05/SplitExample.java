package chap05.sce05;

public class SplitExample {
	public static void main(String [] args) {
		String board = "1, 자바 학습, 참조 타입 String을 학습합니다., 홍길동";
		
		String[] tokens = board.split(",");
		
		System.out.println("번호:" +tokens[0]);
		System.out.println("제목:" +tokens[1]);
		System.out.println("내용:" +tokens[2]);
		System.out.println("이름:" +tokens[3]);
		
		for(int i=0; i <4; i++) {
			System.out.println(tokens[i]);
		}
		
	}
}
