package chap05.sce05;

public class EquaIsExaple {
	public static void main(String[] args) {
		String StrVar1 = "홍길동";
		String StrVar2 = "홍길동";
		
		if(StrVar1 == StrVar2) {
			System.out.println("StrVar1과 strVar2는 참조가 같음");
		}else{
			System.out.println("StrVar1과 StrVar2는 참조가 다름");
		}
		
		if(StrVar1.equals(StrVar2)) {
			System.out.println("StrVar1과 StrVar2는 문자열이 같음");
		}
		
		String StrVar3 = new String("홍길동");
		String StrVar4 = new String("홍길동");
		
		if(StrVar3 == StrVar4) {
			System.out.println("StrVar3과 StrVar4는 참조가 같음");
		}else {
			System.out.println("StrVar3과 StrVar4는 참조가 다름");
		}
		
		if(StrVar3.equals(StrVar4)) {
			System.out.println("StrVar3과 StrVar4는 문자열이 같음");
		}
	}
}