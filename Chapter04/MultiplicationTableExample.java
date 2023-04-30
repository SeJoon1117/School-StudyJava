package chap04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int r=1;r<10;r++) {
				System.out.println(i+"x"+r+"="+i*r);
			}
			System.out.println();
		}
	}
}
