public class interface_Java_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gok1[] = {"백지영-사랑안해","코요테-순정","자두-김밥","Charile-puth - we don't talk anymore"};
		start s = new start(gok1);
		
		s.startOn();
		s.pause();
		s.movedown();
		s.moveup();
		s.moveup();	
		s.moveup();
		s.moveup();
		s.movedown();
		s.movedown();
		s.movedown();
		s.movedown();
		s.movedown();
		s.moveup();
		s.moveup();
		s.moveup();
		s.moveup();
		s.pause();
		s.pause();
		s.pause();
		s.pause();
		s.turnoff();
	}


}
class Unit1{

	
	int size;
	int pos =0;
	String arr1[];
	Unit1(String arr[]) {
		// TODO Auto-generated constructor stub
		this.size =arr.length;	
		this.arr1 = arr;
	}


}
interface Play{

	void startOn();
	void moveup();
	void movedown();
}

interface Pause{

	void pause();
	void turnoff();
}

interface ActTool extends Pause,Play{
}



class start extends Unit1 implements ActTool{

	
	start(String arr[]) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

		System.out.println("일시정지 상태입니다.");

	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("Device will turn off!! bye bye~");
		

	}

	@Override
	public void startOn() {
		// TODO Auto-generated method stub
		System.out.println("HI!!."+"\n"+ super.pos+"번째 곡"+"듣고 계신 곡은 "+arr1[pos]+" 입니다.");

	}

	@Override
	public void moveup() {
		// TODO Auto-generated method stub
		if (super.pos == size-1) {
			super.pos = 0;
		}
		else {
			super.pos++;
		}
		System.out.println(+super.pos+"번째 곡"+"듣고 계신 곡은  "+ arr1[pos]+" 입니다.");

	}
	public void movedown() {
		
		if (super.pos <= 0) {
			super.pos =size-1;
			System.out.println(+super.pos+"번째 곡"+"듣고 계신 곡은  "+ arr1[pos]+" 입니다.");
			
		}
		else {
			super.pos--;
			System.out.println(+super.pos+"번째 곡"+"듣고 계신 곡은  "+ arr1[pos]+" 입니다.");
		}
		
		
	}


}

