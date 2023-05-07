package chap06.sec07;

public class Car1Example {
	public static void main(String[]args) {
		Car1 car1 = new Car1("자가용");
		System.out.println("car1.compaby : "+car1.company);
		System.out.println("car1.model : "+car1.model);
		System.out.println();
		
		Car1 car2 = new Car1("자가용","빨강");
		System.out.println("car2.compaby : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println("car2.color : "+car2.color);
		System.out.println();
		
		Car1 car3 = new Car1("택시","검정",200);
		System.out.println("car3.compaby : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println("car3.maxSpeed : "+car3.maxSpeed);
		System.out.println();
	}
}
