package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class janggi_bfs {

	static boolean [][]visit;
	static int [][]map;
	static int row,jolcol,jolrow;
	static int col;
	static int []dx = {2,2,1,-1,-2,-2,1,-1};
	static int []dy = {1,-1,2,2,1,-1,-2,-2};
	static Queue<Integer>q  = new LinkedList<Integer>();
	public static int bfs(int startX, int startY) {
		q.add(startX);
		q.add(startY);
		visit[startX][startY] = true;
		map[startX][startY] = 1; 
		while(!q.isEmpty())
		{
			int curX = q.poll();
			int curY = q.poll();
			
			visit[curX][curY] = true;
			
			for (int i = 0; i < dx.length; i++) {
				int NY = curY + dy [i]; 
				int NX = curX + dx [i];
				if (NX <= 0 || NX > row || NY > col || NY <= 0) {
					continue;
				}
				if (map[NX][NY] == 0 && !visit[NX][NY]) {
					
					q.add(NX);
					q.add(NY);
					visit[NX][NY] =true;
					map[NX][NY] = map[curX][curY]+1;
				}
				if (NY == jolcol && NX == jolrow ) {
					return map[NX][NY];
					
				}
				
			}
			
			
		}
		return 0;
			
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		
		map = new int[row+1][col+1];
		visit = new boolean[row+1][col+1];
		st = new StringTokenizer(br.readLine());
		int malrow = Integer.parseInt(st.nextToken());
		int malcol = Integer.parseInt(st.nextToken());
		 jolrow = Integer.parseInt(st.nextToken());
		 jolcol = Integer.parseInt(st.nextToken());
		int result = bfs(malrow,malcol);
		System.out.println(result-1);
		
	}

}
