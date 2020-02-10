package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2455_simul {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = 0; 
		int result = 0;
		for (int i = 0; i < 4; i++) {
			
			st = new StringTokenizer(br.readLine());
			int down = Integer.parseInt(st.nextToken());
			int up = Integer.parseInt(st.nextToken());
			cnt = cnt + up;
			cnt = cnt - down;
			result = Math.max(result, cnt);
		}
		System.out.println(result);
	}

}
