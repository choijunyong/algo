package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class tomato_2_exam {
	static int M, N, H;

	static int [][][]map;
	static boolean [][][]visit;
	static Queue<Integer>q = new LinkedList<Integer>();
	static int sol = 1;
	static int[]dx = {0,0,0,0,1,-1};
	static int[]dy = {0,0,1,-1,0,0};
	static int[] dh = {1,-1,0,0,0,0};
	public static void bfs(int hei , int x , int y)
	{
		q.add(hei);
		q.add(x);
		q.add(y);
		visit[hei][x][y] = true;


		while (!q.isEmpty()) {
			int curH = q.poll();
			int curX = q.poll();
			int curY = q.poll();


			for (int i = 0; i < dx.length; i++) {

				int nx = curX + dx[i];
				int ny = curY + dy[i];
				int nh = curH + dh[i];
				if (nx <= 0   || nx > N || ny <= 0 || ny > M || nh <= 0 || nh > H)  {
					continue;
				}
				if (map[nh][nx][ny]== 0 && !visit[nh][nx][ny]  ) {
					q.add(nh);
					q.add(nx);
					q.add(ny);
					map[nh][nx][ny] = map[curH][curX][curY]+1;
					visit[nh][nx][ny] = true;
				}

			}


		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		boolean chk = false ;
		map = new int [H+1][N+1][M+1];
		visit = new boolean [H+1][N+1][M+1];
		for (int i=1; i<=H; i++)
		{
			for (int j=1; j<=N; j++)
			{
				st = new StringTokenizer(br.readLine());
				for (int k=1; k<=M; k++)
				{
					map[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}

		// 여기서부터 작성

		for (int i = 1; i <= H; i++) {
			if (chk) {
				break;
			}
			for (int j = 1; j <= N; j++) {
				if (chk) {
					break;
				}
				for (int j2 = 1; j2 <= M; j2++) {

					if (map[i][j][j2] == 0) {
						chk = true;
						break;
					}

				}

			}
		}
		if (!chk) {
			System.out.println("0");
			return ;
		}

		for (int i = 1; i <= H; i++) {

			for (int j = 1; j <= N; j++) {

				for (int j2 = 1; j2 <= M; j2++) {

					if (map[i][j][j2] == 1 &&  !visit[i][j][j2]) {
						bfs(i,j,j2);
					}
				}
			}

		}

		int max = 0;
		for (int i1 = 1; i1 <= H; i1++) {


			for (int i = 1; i <= N; i++) { 
				for (int j = 1; j <= M; j++) { 
					if (map[i1][i][j]==0) { 
						System.out.println("-1"); 
						return ; 
					} 
					if (map[i1][i][j]>max) { 
						max  = map[i1][i][j]; 
					} 
				} 

			}


		} 
		System.out.println(max-1);


//				5 3 2
//				0 0 0 0 0
//				0 0 0 0 0
//				0 0 0 0 0
//				0 0 0 0 0
//				0 0 1 0 0
//				0 0 0 0 0

		//	4 3 2
		//	1 1 1 1
		//	1 1 1 1
		//	1 1 1 1
		//	1 1 1 1
		//	-1 -1 -1 -1
		//	1 1 1 -1
	}

}