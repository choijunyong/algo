
public class sangsok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Child();
		Child c = new Child();
		p.method();
		c.method();
		
		
	}

}

class Parent{
	
	int x= 100;
	void method()
	{
		System.out.println("parent method");
	}
}

class Child extends Parent{
	
	int x = 200;
	
	
	
	void method1()
	{
		System.out.println("x: "+x);
		System.out.println("super.x:"+super.x);
		System.out.println("this.x:"+this.x);
		
	}
	
}
