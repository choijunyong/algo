package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class main {
	static Queue <Integer>q = new LinkedList<Integer>();
	static Queue <Integer>q1 = new LinkedList<Integer>();
	static int []dx= {-1,1,0,0};
	static int []dy= {0,0,-1,1};
	static int [][]map;
	static boolean [][]visit;
	static int ver,edge, cnt;
	static int row,col;



	static void bfs(int x,int y)
	{
		Queue <pair> q2 = new LinkedList<pair>();
		q2.add(new pair(x, y));
		visit[x][y] = true;
		while (!q.isEmpty()) {
			pair p = q2.poll();
			int tempX = p.x;
			int tempY = p.y;
			for (int i = 0; i < dx.length; i++) {
				int nx = tempX+dx[i];
				int ny = tempY+dy[i];
				if (nx < 0 || nx > row || ny < 0 || ny > col)
					continue;
				if(visit[nx][ny]==false && map[nx][ny] ==1 )
				{

					q2.add(new pair(nx, ny));
					visit[nx][ny] = true;

				}

			}

		}
		cnt++;



	}

	public static void main(String[] args) throws IOException
	{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(bf.readLine());
		int testcnt = Integer.parseInt(st.nextToken());

		for (int i = 0; i < testcnt ; i++) {
			st = new StringTokenizer(bf.readLine());
			row= Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			int edge = Integer.parseInt(st.nextToken());
			map = new int [row+1][col+1];
			visit  = new boolean [row+1][col+1];
			for (int j = 0; j < edge; j++) 
			{
				st = new StringTokenizer(bf.readLine());
				int tmp1 = Integer.parseInt(st.nextToken());
				int tmp2 = Integer.parseInt(st.nextToken());
				map[tmp1][tmp2] = 1;

			}
			cnt =0;
			for (int j = 0; j < row; j++) {

				for (int j2 = 0; j2 < col; j2++) {
					if (map[j][j2]==1 && visit[j][j2]== false) {
						bfs(j,j2);

					}
				}
			}
			
			
			System.out.println(cnt);

		}
	
		
		
	}
	
}
class pair{
	int x,y;
	pair(int x,int y)
	{
		this.x = x;
		this.y = y;
		
	}
	
	
}
