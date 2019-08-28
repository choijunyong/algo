package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class robot_BFS_2 {
	static int map[][];
	static int visit[][];
	static int row,col;

	static LinkedList<Integer> l = new LinkedList<Integer>();
	static int dx [] = {0,0,0,1,-1};
	static int dy [] = {0,1,-1,0,0};
	static int dd[][] = {{0,0},{3,4},{3,4},{1,2},{1,2}};
	static int TarX,TarY,startX,startY,dir,Arrdir;


	public static void bfs(int x, int y, int dir1) {
		l.add(x);
		l.add(y);
		l.add(dir1);
		visit[x][y] = 1;


		while(!l.isEmpty())
		{

			int curx = l.poll();
			int cury = l.poll();
			int curdir = l.poll();
			if (curx == TarX && cury == TarY && curdir == dir) {

				System.out.println(visit[curx][cury]);
			}
			for (int i = 1; i <= 4; i++) {
				int nx = curx + dx[i];
				int ny = cury + dy[i];
				if (nx > row || nx <= 0 || ny > col || ny <= 0 || map[nx][ny] == 1) {
					continue;
				}
				if (visit[nx][ny] ==0 && map[nx][ny] == 0 ) {
					l.add(nx);
					l.add(ny);
					l.add(curdir);
					visit[nx][ny] = visit[curx][cury] +1;
					
				}
			}



		}



	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		map= new int [row+1][col+1];
		visit = new int[row+1][col+1];
		for (int i = 1; i <= row; i++) {

			String []tmp = br.readLine().split(" ");

			for (int j = 1; j <= col; j++) {
				map[i][j] = Integer.parseInt(tmp[j-1]);
			}
		}


		st = new StringTokenizer(br.readLine());
		startX = Integer.parseInt(st.nextToken());
		startY = Integer.parseInt(st.nextToken());
		dir = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		TarX = Integer.parseInt(st.nextToken());
		TarY = Integer.parseInt(st.nextToken());
		Arrdir = Integer.parseInt(st.nextToken());
		bfs(startX,startY,dir);



	}

}
