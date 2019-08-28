package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _notyetjungling {

	static int [][]map; 
	static int [][]tmpmap;
	static int x,y,curX,curY;
	static boolean [][]visit;
	static int []dx = {0,0,1,-1};
	static int []dy = {1,-1,0,0};
	static int Nx,Ny;
	static int cnt = 0;
	static Queue<Integer> q = new LinkedList<Integer>();
	
	
	
	
	public static void bfs(int x1, int y1) 
	{
		q.add(x1);
		q.add(y1);
		visit[y1][x1] = true;
		tmpmap[y1][x1] = 1;
		map[y1][x1] = 0;
		
		while (!q.isEmpty()) {
			curX = q.poll();
			curY = q.poll();
			
			map[curY][curX] = 0;
			
			for (int i = 0; i < dx.length; i++) {
				Nx = curX +dx[i];
				Ny = curY + dy[i];
				
				if (Nx <= 0 || Nx > x || Ny <= 0 || Ny > y) {
					continue;
				}
				if(map[Ny][Nx] == 1 && !visit[Ny][Nx])
				{
					tmpmap[Ny][Nx] = tmpmap[curY][curX]+1;
					q.add(Nx);
					q.add(Ny);
					visit[Ny][Nx] = true;
					
				}
			}
		}
		System.out.println(tmpmap[curY][curX]+2);



	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		map = new int[y+10][x+10];
		tmpmap = new int[y+10][x+10];
		visit = new boolean[y+10][x+10]; 
		
		for (int i = 1; i <= y; i++) {
			String tmp  = br.readLine();
				for (int j = 0; j < tmp.length(); j++) {
					map[i][j+1] = tmp.charAt(j)-'0';
				}
		}
		
		
		
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= x; j++) {
				if (map[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
