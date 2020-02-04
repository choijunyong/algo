package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _notyetduhagi {

	static int N;
	static int K;
	static boolean []chk;
	static int []tmp;
	static boolean chk1;

	public static int dfs(int num, int sum)
	{

		if (sum== K) {
			chk1 = true;
			return 1;
		}
		if (sum > K) 
			return 0;
		if (num >= N ) {
			return 0;
		}
	
		if (dfs(num + 1, sum+ tmp[num])==1) {
			return 1;
		}
		
		
		
		
		
		
		return 0;
		




	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int testcnt = Integer.parseInt(st.nextToken());
		for (int i = 0; i < testcnt; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			tmp = new int [N];
			chk = new boolean [N];

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				tmp[j] = Integer.parseInt(st.nextToken());
			}

			System.out.println(dfs(0,0));


		}
	}

}
