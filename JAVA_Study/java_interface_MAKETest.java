/*
public class java_interface_MAKETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//오류가 있다면 수정하고 attack , move1 , move12 함수를 출력하는 메인문 작성.
		
		
		
	}

}


class Unit123{
	
	int curx = 0;
	int cury = 0;
	
}

interface attack1{
	void attack(Unit123 u); 
}

interface MoveUnit{
	void move1(int x,int y);
	
}
interface MoveUnit1{
	void move12(int x, int y);
	
}
interface MoveUnit2{
	void move12(int x, int y);
	
}

interface Fighter3 extends attack1,MoveUnit,MoveUnit1,MoveUnit2{}
interface FIghter2 extends attack1,MoveUnit{}

abstract class fighter1 implement attack1 {
	
	@Override
	public void attack(Unit123 u) {
		// TODO Auto-generated method stub
		System.out.println(u.curx+""+" "+ u.cury+"에서 공격!!");
		
	}
	@Override
	public void move1(int x, int y) {
		// TODO Auto-generated method stub
		x = super.curx;
		y = super.cury;
		System.out.println(x);
		
	}
	@Override
	public void move12(int x, int y) {
		// TODO Auto-generated method stub
		x = super.curx;
		y = super.cury;
		System.out.println(x+""+y);
	}
	
	
}*/