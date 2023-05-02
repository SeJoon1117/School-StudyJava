package chap05.sce03;

public class ReferemceVaviablaCompareExample{
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1=new int[] {1,2,3};
		arr2=new int[] {1,2,3};
		arr3=arr2;
		
		System.out.println(arr1==arr2); //내용은 같으나 주소가 다름
		
		System.out.println(arr2==arr3); //주소를 그대로 갖고와서 내용, 주소가 다 같음
	}
}