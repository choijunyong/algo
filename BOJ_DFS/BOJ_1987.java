package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_1987 {

	static int r ,c;
	static boolean visit[][];
	static boolean visit1[];
	static char map[][];
	static int dx [] = {0,0,-1,1};
	static int dy [] = {1,-1,0,0};
	static int result =0;


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new char[r][c];
		visit = new boolean[r][c];
		visit1 = new boolean[26];

		for (int i = 0; i < r; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < c; j++) {
				map[i][j]= tmp.charAt(j);
			}
		}
		visit[0][0] = true;
		visit1[map[0][0]-'A'] = true;
		
		dfs(0,0,1);
		System.out.println(result+1);
	}

	public static void dfs(int x, int y, int depth) {
		
		
		for (int i = 0; i < dx.length; i++){
		
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
			
			if(!visit[nx][ny] && !visit1[map[nx][ny]-'A']) {
				visit1[map[nx][ny]-'A'] = true;
				visit[nx][ny] = true;
				dfs(nx,ny,depth+1);
				result = Math.max(result,depth);
				visit1[map[nx][ny]-'A'] = false;
				visit[nx][ny] = false;
			}
		}
	}
}