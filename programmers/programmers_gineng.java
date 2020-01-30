package algo;
import java.util.*;
public class programmers_gineng {

	static int progresses[] = {92, 90, 55};
	static int speeds[] = {1, 10, 20};

	public static void main(String[] args) {
		// 

		int[] answer;
		int [] time = new int[progresses.length];
		Queue <Integer>q = new LinkedList<Integer>();

		for(int i = 0; i < progresses.length; i++){
			int tmpSpeed  = speeds[i];
			int tmpDev = progresses[i];
			int cnt = 0;
			for(int j = 0;;){
				if(tmpDev >= 100) break;

				tmpDev = tmpDev + tmpSpeed;
				cnt++;
			}
			time[i] = cnt;
		}
		int idx = 0;
		Loop1: for(int i = 0; i < time.length; i++){
			int tmp = time[idx];
			int cnt = 0;
			for(int j = idx; j < time.length; j++)
			{
				if(tmp >= time[j] ) {
					cnt++;
					if(j == time.length - 1) {
						
						q.add(cnt);
						break Loop1;
					}					
				}
				else{
					idx = j;
					break;
				}
			}
			q.add(cnt);
		}

		answer = new int [q.size()];
		int cnt3 = q.size();
		for(int i = 0; i< cnt3; i++) answer[i] = q.poll();
		for(int i = 0; i< answer.length; i++) {System.out.printf(answer[i]+"");}
	}
}


