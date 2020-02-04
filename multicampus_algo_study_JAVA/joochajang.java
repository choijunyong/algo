package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class joochajang {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		Queue<Integer>q = new LinkedList<Integer>();
		int cnt = Integer.parseInt(st.nextToken());
		for (int i = 0; i < cnt; i++) {

			st = new StringTokenizer(br.readLine());
			int minprice = 0;
			int namuprice = 0;
			int min = Integer.parseInt(st.nextToken());
			if (min < 10) {
				q.add(0);
			}
			else if (10<= min && min<30 ) {
				q.add(500);
			}
			else {

				min = min - 30 ;
				minprice = ((min/10)*300)+500; 
				namuprice = (min%10);
				if (namuprice == 0) {
					if (minprice >= 50000) {
						q.add(50000);
					}
					else {
						q.add(minprice);

					}
				}
				else {
					
					if (minprice >= 50000 ) {
						q.add(50000);
					}
					else {
						
						q.add(minprice+300);

					}
				}
			}
		}
		int result = 0;
		while (!q.isEmpty()) {
			result = result+ q.poll();
			
		}
		System.out.println(result);
	}
}
