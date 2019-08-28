package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _notyetnongjang_exam {
	static int cowWeight[];
	static boolean visit[];
	static int cnt;
	static int sol;




	public static int check(int sum, int g) {
		while (true) {
			if ((sum % 10 + g % 10) > 9) return 0;
			sum /= 10;
			g /= 10;
		}
		
	}


	public static void dfs(int node ,int sum, int cnt1)
	{
		if (node >= cnt) 
		{
			if (sol < cnt1) sol = cnt1;
			return;
		}
		if (sol >= cnt1 + (cnt - node)) return;

		if (check(node, cowWeight[node]) == 1) {
			dfs(node+1 ,sum+cowWeight[node], cnt1+1);
		}
		dfs(node+1 ,sum, cnt);


	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st= new StringTokenizer(br.readLine());
		cnt = Integer.parseInt(st.nextToken());
		cowWeight = new int[cnt];
		visit= new boolean[cnt];
		for (int i = 0; i < cnt; i++) {
			st= new StringTokenizer(br.readLine());
			cowWeight[i] = Integer.parseInt(st.nextToken());

		}
		dfs(0,0,0);
		System.out.println(sol);

	}

}
