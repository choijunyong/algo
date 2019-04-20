package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class main {
	static Queue <Integer>q = new LinkedList<Integer>();
	static Queue <pair>q1 = new LinkedList<pair>();
	static int []dx= {-1,1,0,0};
	static int []dy= {0,0,-1,1};
	static int [][]map;
	static int [][]edgemap;
	static boolean [][]visit;
	static int ver,edge, cnt,row,col;




	static void bfs(int x,int y)
	{
		cnt=0;
		q1.add(new pair(x, y));
		while (!q1.isEmpty()) {
			pair p = q1.poll();
			int tmpX = p.x;
			int tmpY = p.y;
			visit[tmpX][tmpY] = true;
			
			
			for (int i = 0; i < dx.length; i++) {
				int nx = tmpX + dx[i];
				int ny = tmpY + dy[i];
				
				if (nx < 0 || nx >=row || ny < 0 || ny >= col) {
					continue;
				}
				if (map[nx][ny] == 1 && !visit[nx][ny]) {

					q1.add(new pair(nx, ny));
					visit[nx][ny] = true;
					map[nx][ny]= map[tmpX][tmpY]+1;
				}
			}	

		}

	}

	public static void main(String[] args) throws IOException
	{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String []b ;
		st = new StringTokenizer(bf.readLine());
		row=Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		map = new int [row][col];
		visit = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			String a =bf.readLine();
			b = a.split("");
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(b[j]);	
			}
		}
		//		for (int i = 0; i < row; i++) {
		//			for (int j = 0; j < col; j++) {
		//				if (map[i][j]== 1 && !visit[i][j]) {
		//					bfs(i,j);
		//				}
		//			}
		bfs(0,0);
		System.out.println(map[row-1][col-1]);
	}

}

class pair {
	int x,y;
	pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

}

