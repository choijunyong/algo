
public class abstract_JAVA_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		action a = new action();
		

		
		for (int i = 0; i < 23; i++) {
			a.j.actionTo_jalmot();
		}
		for (int i = 0; i < 21; i++) {
			a.j.actionTo_jalham();
		}
		
		

	}

}

class action extends heartLevel{

	junyong j  = new junyong(0,0) {

		@Override
		void actionTo_jalmot() {
			// TODO Auto-generated method stub
			eunjihwaLevel++;
			junyongpokLevel++;
			System.out.println("은지의 화가 늘어났어요.. 현재 은지의 화: "+eunjihwaLevel);

			if (eunjihwaLevel >= 5) {
				System.out.println("준용이가 화가나서 말대꾸를 시작했어요!");
				e.givehwa();
				
				eunjihwaLevel =0;
			}

		}

		@Override
		void actionTo_jalham() {
			// TODO Auto-generated method stub
			eunjichingLevel++;
			junyonghengLevel++;
			System.out.println("은지가 행복해요... 현재 은지의 칭찬: "+eunjichingLevel);
			if (eunjichingLevel >= 5) {

				e.giveching();
				System.out.println("준용이가 행복해요!!");
				eunjichingLevel =0;
			}

		}
	};

	eunjy e = new eunjy(0,0) {

		@Override
		void giveching() {
			// TODO Auto-generated method stub

			System.out.println("아이구 우리 준용이 잘했어요!!!");
			


		}

		@Override
		void givehwa() {
			// TODO Auto-generated method stub

			System.out.println("죽고 싶어!?!?!?? 다음부터 그러지말아라 진짜!");
			

		}
	};

}

abstract class junyong  extends heartLevel{

	abstract void actionTo_jalmot();
	abstract void actionTo_jalham();
	junyong(int a, int b) {
		// TODO Auto-generated constructor stub
		junyonghengLevel = a;
		junyongpokLevel = b;
	}

}

abstract class eunjy extends heartLevel{

	abstract void givehwa();
	abstract void giveching();


	eunjy(int a, int b) {
		// TODO Auto-generated constructor stub
		eunjichingLevel = a;
		eunjihwaLevel =b;
	}


}

class heartLevel{

	int junyongpokLevel;
	int junyonghengLevel;
	int eunjihwaLevel;
	int eunjichingLevel;

}
