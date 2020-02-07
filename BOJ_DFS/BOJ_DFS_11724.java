package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_DFS_11724 {

	static int map[][];
	static boolean visit[];
	static int cnt=0;
	static int Node,edge;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		Node  = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		map = new int[Node+1][Node+1];
		visit = new boolean[Node+1];

		for (int i = 0; i < edge; i++) {

			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			map[x][y] = 1;
			map[y][x] = 1;

		}


		for (int i = 1; i <= Node; i++) if(!visit[i]){cnt++;dfs(i);}
		System.out.println(cnt);

	}



	static public void dfs(int Node1) {

		visit[Node1] = true;
		for (int i = 1; i <= Node; i++) {
			if(map[Node1][i] == 1 && !visit[i] ) {
				dfs(i);
			}	
		}
	}
}


