package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bomoolsum_bfs {

	static int [][]visit;
	static char [][]map;
	static int col,row;
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	static Queue<Integer>q = new LinkedList<Integer>();
	static LinkedList<Integer>l = new LinkedList<Integer>();
	static LinkedList<Integer>result = new LinkedList<Integer>();
	public static void bfs(int x, int y)
	{
		int NX = 0;
		int NY = 0;
		int curX =0;
		int curY =0;
		q.add(x);
		q.add(y);
		visit[x][y] = 1;
		while(!q.isEmpty())
		{
			curX = q.poll();
			curY = q.poll();
			for (int i = 0; i < dx.length; i++) {
				NX = curX + dx[i];
				NY = curY + dy[i];
				if (NX < 0 || NX >= row || NY < 0 || NY >= col) {
					continue;
				}
				if (map[NX][NY] == 'L' && visit[NX][NY]==0) {
					q.add(NX);
					q.add(NY);
					visit[NX][NY] = visit[curX][curY]+1;
					
				}

			}


		}
		l.add(visit[curX][curY]);
		



	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());


		// 데이터 처리과점 
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		map = new char [row][col];
		visit = new int[row][col];

		for (int i = 0; i < row; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < col; j++) {
				map[i][j] = tmp.charAt(j);
			}


		}

		// map 에서 L을 만나면 BFS돌림 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j]  == 'L') {

					bfs(i,j);
					visit = new int[row][col];
				}
			}

		}
		l.sort(null);
		System.out.println(l.pollLast()-1);

	}

}
