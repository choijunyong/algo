package algo;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Solution1 sl = new Solution1();
	
		int [] numbers = {6,10,2};
		String str = sl.solution(numbers);
		System.out.println(str);


	}

}

class Solution1{
    public String solution(int[] numbers) {
        String answer = "";
        int flag = 0;
        
        ArrayList <aa> arr = new ArrayList<aa>();
        for(int i = 0 ; i< numbers.length; i++)
        {
            if(numbers[i] != 0) flag = 1;
        }
        if(flag == 0) {answer = "0"; return answer;}
        
        for(int i = 0 ; i < numbers.length; i++){
            arr.add(new aa(numbers[i],numbers[i]%10));
        }
        
        Collections.sort(arr, new Comparator<aa>(){
			@Override
			public int compare(aa o1, aa o2) {
				// TODO Auto-generated method stub
				if (o1.namu < o2.namu) {
					return 1;
				}
				if(o1.namu > o2.namu) {
					return -1;
				}
				int a = o1.si / 10 ;
                int b = o2.si / 10 ;
                if(a > b) return -1;
                else if(a < b ) return 1;
                else return 0;
			}
		});
        
        
        for(int j  = 0; j < arr.size(); j++ ){
            int tmp = arr.get(j).si;
            answer += tmp;
        }
        
        return answer;
    }
}

class aa {
	int si;
	int namu;

	public aa(int si, int namu) {
		// TODO Auto-generated constructor stub
		this.si = si;
		this.namu =namu;
	}
}