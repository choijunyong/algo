package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _notyetChiken_house {

	static int [][]map;
	static boolean [][]chk;
	static int N;
	static int M;

	
	public static void dfs(int n, int cnt)
	{
		if (cnt == M) {
			
		}
		
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		chk = new boolean [N+1][N+1];
		
		/* data insert*/
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		/*solution*/
		
		dfs(0,0);
	}

}
