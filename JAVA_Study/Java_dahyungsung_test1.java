
public class Java_dahyungsung_test1 {

	//	public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	//		
	//		
	//		animal ani = new animal();
	//		dog d = null;
	//		cat c = null;
	//		d = (dog)ani;
	//		System.out.println(d.x);		
	//
	//	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//		animal ani = null;
//		dog d = new dog();
//		cat c = null;
//		ani = d;
//		c= (cat)ani;
//		System.out.println(c.x);		
//
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		animal ani = null;
		dog d = new dog();
		dog d1 = null;
		ani = d;
		System.out.println(ani.x);
		ani = new cat();
		d1= (cat)ani;
		System.out.println(d1.x);
		ani.method();
		System.out.println(ani.x);
		d1.method();

	}

}


class animal {

	int x = 10;

	void method()
	{
		x = x + 10; 
		System.out.println("Method");

	}


}

class dog extends animal{

	int x=15;
	
	void method()
	{
		
		super.x = this.x + 10;
		System.out.println("dog Method");

	}



}

class cat extends dog{

	int x =20;
	void method()
	{
		super.x = super.x + 10;
		System.out.println("cat Method");

	}	

}
