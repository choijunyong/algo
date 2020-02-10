package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1094_simul {

	static int[] result;
	static boolean[]visit;
	static boolean check = false;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		StringTokenizer st;
		int tmp = 64;
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());



		while(tmp >=1) {arr.add(tmp); tmp/=2;}
		result = new int [arr.size()];
		visit = new boolean [arr.size()];
		int size =0;
		int start = 0;
		for(int data : arr) result[size++] = data;

		dfs(start,x);
	}

	public static void dfs(int start ,int x) {

		if (check) {
			return;
		}

		for (int i = start; i < result.length; i++) {

			if(result[i] <= x)
			{
				visit[i] = true;
				valid(x);
				dfs(i+1,x);
				visit[i] = false;
			}
		}
	}
		public static void valid(int x) {
			int tmp  =0 ;
			int cnt =0;

			for (int i = 0; i < result.length; i++) {
				if (visit[i]) {
					tmp =tmp + result[i];
					cnt++;
				}
			}
			if(tmp == x) 
			{
				check = true;
				System.out.println(cnt);

			}
		}
	}
