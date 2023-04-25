package chap02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1=15;
		if(v1>10) {
			int v2 = v1-10;
		}
		int v3= v1+5;
		//int v3 = v1+v2+5; v2는 if문 안에 있어서 사용할 수 없음
	}
}
