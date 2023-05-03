package chap05.Q;

public class num8 {
	public static void main(String[] args) {
		int [][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		int sum=0;
		double arg=0;
		for(int i=0;i<array.length;i++) {
			sum = 0;
			for(int r=0;r<array[i].length;r++) {
				sum = sum + array[i][r];
			}
			arg = (double)sum/array[i].length;
			System.out.println(sum + "," + arg);
		}
	}
}
