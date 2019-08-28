package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class jawaesun {
	static int [][] map;
	static int[][] visit;
	static Queue<Integer>prq = new LinkedList<Integer>();
	static int dx [] = {0,0,1,-1};
	static int dy [] = {0,0,1,-1};
	static int ver;
	static int min = 999999999; 
	
	
	public static void bfs(int x, int y) {
		
		prq.add(x);
		prq.add(y);
		visit[x][y] = 1;
		while (!prq.isEmpty()) {
			int curX = prq.poll();
			int curY = prq.poll();
			visit[curX][curY] = 1;
			
			for (int i = 0; i < dx.length; i++) {
				int NX = curX + dx[i];
				int NY = curY + dy[i];
				if (NX > ver || NX <= 0 || NY > ver || NY <= 0 ) {
					continue;
				}
				if (min > map[NX][NY]) {
					min = map[NX][NY];
				}
				if (visit[NX][NY] <= min + map[NX][NY]) {
					continue;	
				}
				visit[NX][NY] = min + map[NX][NY];
				prq.add(NX);	
				prq.add(NY);
				
				
			}
			
			
			
		}
		
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		ver = Integer.parseInt(st.nextToken());
		map = new int [ver+1][ver+1];
		visit = new int [ver+1][ver+1];
		
		for (int i = 1; i <= ver; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < ver; j++) {
				map[i][j+1] = tmp.charAt(j)-'0';
			}
		}
		bfs(1,1);
		System.out.println(map[ver][ver]);

	}

}
