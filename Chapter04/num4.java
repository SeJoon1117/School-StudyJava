package chap04.Q;

public class num4 {
	public static void main(String [] args) {
		while(true) {
			int r = (int)(Math.random()*6)+1;
			int i = (int)(Math.random()*6)+1;
			System.out.println("("+r+","+i+")");
			if(r+i == 5) {
				break;
			}
		}
	}
}