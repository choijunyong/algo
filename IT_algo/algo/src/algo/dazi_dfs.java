package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class dazi_dfs {

	static int [][]map;
	static boolean [][] visit;
	static int ver;
	static int cnt1;
	static int cnt2=0;
	static int []dx = {0,0,1,-1};
	static int []dy = {1,-1,0,0};
	public static void dfs(int node,int node2)
	{
		visit[node][node2] = true;
		for (int i = 0; i < dx.length; i++) {
			int nx = node+ dx[i];
			int ny = node2 + dy[i];
			if (nx < 0 || nx >= ver || ny >= ver || ny < 0) {
				continue;
			}
			if (map[nx][ny] == 1 && !visit[nx][ny]) {
				cnt1++;
				dfs(nx,ny);
			}
		}
	}




	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		ver = Integer.parseInt(st.nextToken());
		map = new int[ver][ver];
		visit = new boolean[ver][ver];

		for (int i = 0; i < ver; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < ver; j++) {
				map[i][j] = tmp.charAt(j)-'0';

			}
		}
		LinkedList<Integer> l = new LinkedList<Integer>();
		cnt1 = 1;
		for (int i = 0; i < ver; i++) {
			for (int j = 0; j < ver; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					dfs(i,j);
					l.add(cnt1);
					cnt2++;
					cnt1 = 1;
					l.sort(null);
				}
			}

		}
		System.out.println(cnt2);
		while (!l.isEmpty()) {

			System.out.println(l.pollFirst());
		}


	}

}
