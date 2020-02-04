package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _notyethakgeub {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Integer>q = new LinkedList<Integer>();
		st = new StringTokenizer(br.readLine());

		int cnt = Integer.parseInt(st.nextToken());
		int []check1 = new int [cnt]; 
		int []check2 = new int [cnt]; 
		int []check3 = new int [cnt]; 
		int []total = new int[cnt];
		for (int i = 1; i <= cnt; i++) {

			st = new StringTokenizer(br.readLine());
			int hu1jum = Integer.parseInt(st.nextToken());
			int hu2jum = Integer.parseInt(st.nextToken());
			int hu3jum = Integer.parseInt(st.nextToken());

			check1[hu1jum] ++;
			check2[hu2jum] ++;
			check3[hu3jum] ++;
			for (int j = 1; j <= 3; j++) {
				
			}
			

		}
	}
}



