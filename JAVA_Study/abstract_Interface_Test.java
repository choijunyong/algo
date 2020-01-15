
public class abstract_Interface_Test {

	public static void main(String[] args) {
		basic b = new basic(1, 2);
		System.out.println("1번."+b.add(b.x, b.y));
		
		
		// 정답 2 엔터 3 
		Calcul c2 = new Calcul(4, 2) {
			@Override
			int mul(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}

			@Override
			int minus(int x, int y) {
				// TODO Auto-generated method stub
				return x - y;
			}

			@Override
			int div(int x, int y) {
				// TODO Auto-generated method stub
				return x / y;
			}

			@Override
			int add(int x, int y) {
				// TODO Auto-generated method stub
				return x * y;
			}
		};
		//1
		System.out.println("2번"+c2.add());
		// 답 :10
		System.out.println("3번."+c2.add(2, 3));
		//답: 6
		System.out.println("4번."+c2.x + " " + c2.y);
		//답: 4,2 
		System.out.println("5번."+b.add(3, 4));
		// 답 :7
	};
}

abstract class Calcul {
	int x, y;

	Calcul(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("1");
	}

	abstract int add(int x, int y);

	abstract int minus(int x, int y);

	abstract int div(int x, int y);

	abstract int mul(int x, int y);

	int add() {
		return 10;
	}

	int add(int x) {
		return x;
	}
}

class basic extends Calcul implements add {
	int x =0;
	int y= 0;
	basic(int x, int y) {
		super(x, y);
		
		System.out.println("2");
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}

	public int div(int x, int y) {
		return x / y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public int min(int x, int y) {
		return 50;
	}
}

interface add {
	int add(int x, int y);

	int min(int x, int y);
}

