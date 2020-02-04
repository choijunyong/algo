package cotongryung;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class  BOJ_7562_knight{

	static int [][] map;
	static boolean [][] visit;
	static Queue<Integer> q = new LinkedList<Integer>();
	static int []dx = {-1,1,2,2,1,-1,-2,-2};
	static int []dy = {-2,-2,-1,1,2,2,1,-1};
	static int starx,stary,tarx,tary,size;

	public static void bfs(int x, int y )
	{
		q.add(x);
		q.add(y);
		visit[x][y] = true; 

		while (!q.isEmpty()) {


			int curX = q.poll();
			int curY = q.poll();

			for (int i = 0; i < dx.length; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];

				if (nx < 0 || nx >= size || ny < 0 || ny >= size ) {
					continue;
				}
				if (!visit[nx][ny] && map[nx][ny] == 0) {
					q.add(nx);
					q.add(ny);
					visit[nx][ny] = true;

					map[nx][ny] = map[curX][curY] +1;
				}
				if (tarx == nx && tary == ny) {
					System.out.println(map[nx][ny]);

					return;
				}
			}


		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());

		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			size = Integer.parseInt(st.nextToken());
			map = new int [size][size];
			visit = new boolean [size][size];
			st = new StringTokenizer(br.readLine());
			starx = Integer.parseInt(st.nextToken());
			stary = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			tarx = Integer.parseInt(st.nextToken());
			tary = Integer.parseInt(st.nextToken());
			bfs(starx,stary);
			q.clear();
		}

	}

}
