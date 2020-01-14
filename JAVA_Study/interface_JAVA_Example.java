
public class interface_JAVA_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fighter f = new fighter() {
			
		};
		Unit u = new Unit();
		f.Move(1, 2);
		f.attack(u);
				
	}

}


class Unit{
	int cur;
	int x,y;
}
interface move{
	
	void Move(int x, int y);
	
}

interface Attack{
	
	void attack(Unit u);
}

interface fightable extends Attack,move{};


abstract class fighter extends Unit implements fightable{
	@Override
	public void Move (int x, int y) {
		System.out.println("Move method");
	}
	
	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		u.cur = 1; 
		u.x =2;
		u.y = 10;
		System.out.println("Attack Method !"+"\n"+u.x+"  "+u.y+"  "+u.cur);
		
	}
}