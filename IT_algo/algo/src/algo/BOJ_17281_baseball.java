package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17281_baseball {

	static int []ining;
	static int pick = 0; 

	public static void swap ()
	{
		int tmp = ining[0];
		ining[0] = ining[3];
		ining[3] = tmp;
	}
	
	public static void dfs(int node)
	{
		

		for (int i = 0; i < ining.length; i++) {
			
			
			dfs(i);
		}
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());

		// 입력
		for (int i = 0; i < cnt; i++) {
			int out = 0;
			ining = new int [9];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < ining.length; j++) {
				ining[j] = Integer.parseInt(st.nextToken());
			}
			// 1번타자 4번타자 변경
			swap();

			dfs(0);
			
			
			
			
		}// for문 끝
	} // Main문 끝
	
}
