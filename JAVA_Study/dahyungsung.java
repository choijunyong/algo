class dahyungsung {

	public static void main(String[] args) {

		
		Truck t = new Truck();
		Truck t1 = null;
		SportCar s;
		Car c = null;
		
//		이거 실행이 안됨 그 이유는 조상타입을 참조할 수 없기 때문이다.
//		Car c = new Car();
//		Truck t = null;
//		t=c;
		
		c= t;
		t1 =(Truck)c;
		System.out.println(t.age1);
		System.out.println(t1.age1);
		
		
		
		System.out.println(c.age);
		System.out.println(t1.age1);
		t1.klaxon2();
		System.out.println(t1.age);
		
		
		
	}
}
class Car {
	static int age =10;
	int c = 30;

	
}
class Truck extends Car{
	int age1 =0;
	int age2 = 20;
	public void klaxon2(){
		
		age = 200;

	}

}
class SportCar extends Car {
	/* 클래스를 구현하시오. */
	int age2 =0;
	public void klaxon3(){
		
		age = 10;

	}
}
