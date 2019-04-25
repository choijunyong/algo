package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class main 
{
	static int[][] map;
	static Queue<String> q = new LinkedList<>();
	static Queue<Integer> q1 = new LinkedList<>();
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	//	static int[][] map;
	static int[] edgemap;
	static boolean[][] visit;
	static int ver, edge, cnt, row, col,NX,NY;
	static List<Integer> l = new LinkedList<>();
	static int result = 0;

	static void bfs () {

		while(!q1.isEmpty())
		{
			int CX = q1.poll();
			int CY = q1.poll();
			visit[CX][CY] = true;
			for (int i = 0; i < dx.length; i++) 
			{
				NX = CX +dx[i];
				NY = CY +dy[i];
				if (NX < 1 || NX > row || NY < 1 || NY > col) {
					continue;
				}
				if (map[NX][NY]==0 && !visit[NX][NY]) {

					q1.add(NX);
					q1.add(NY);
					visit[NX][NY]= true;
					map[NX][NY] = map[CX][CY]+1;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException 
	{


		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		st = new StringTokenizer(bf.readLine());
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());

		map= new int [row+1][col+1];
		visit  = new boolean[row+1][col+1];
		for (int i = 1; i <= row; i++) {
			st = new StringTokenizer(bf.readLine());

			for (int j = 1; j <= col; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (map[i][j]==1) {
					q1.add(i);
					q1.add(j);
				}

			}
		}
		bfs();

		int max = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (map[i][j]==0) {
					System.out.println("-1");
					return ;
				}
				if (map[i][j]>max) {
					max  = map[i][j];
				}
			}



			

		}
		System.out.println(max-1);
	}
}


class pair {
	int x, y;

	pair(int x, int y) {
		this.x = x;
		this.y = y;
	}


}

