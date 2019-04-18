package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class main {
	static Queue <Integer>q = new LinkedList<Integer>();
	static int []dx= {-1,1,0,0};
	static int []dy= {0,0,-1,1};
	static int [][]map;
	static boolean [][]visit;
	static int size,cnt;

	static void dfs(int x , int y) {
		visit[x][y]= true;
		for (int i = 0; i < dx.length; i++) {
			int nx = x+ dx[i];
			int ny = y +dy[i];
			if(nx<0||nx>=size||ny<0||ny>=size)
				continue;
			if (map[nx][ny] ==1 && visit[nx][ny]== false) {
				cnt++;

				dfs(nx,ny);	

			}


		}
	}	
	static void bfs(int x, int y) {
		q.add(x);
		q.add(y);
		visit[x][y] = true;
		while(!q.isEmpty()) {
			int tempX=q.poll();
			int tempY=q.poll();

			for (int s = 0; s < dx.length; s++) {
				int nx=tempX+dx[s];
				int ny=tempY+dy[s];
				if(nx<0||nx>=size||ny<0||ny>=size)
					continue;
				if (map[nx][ny] ==1 && visit[nx][ny]== false) {
					cnt++;
					visit[nx][ny] = true;

					q.add(nx);
					q.add(ny);

				}


			}
		}
	}


	public static void main(String[] args) throws IOException
	{
		String a;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(bf.readLine());
		size=Integer.parseInt(st.nextToken());
		Queue<Integer>q1 = new LinkedList<Integer>(); 
		
		map = new int [size][size];
		visit = new boolean[size][size];

		String []tmp;
		for (int i = 0; i < size; i++) {
			a = bf.readLine();
			tmp = a.split("");
			for (int j = 0; j < size; j++) {

				map[i][j] = Integer.parseInt(tmp[j]);
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (map[i][j] == 1 && visit[i][j] == false) {
					cnt =1 ; 
					bfs(i,j);
					q1.add(cnt);



				}
			}

		}
		int []b = new int[q1.size()]; 
		int qsize=q1.size();
		System.out.println(qsize);
		for (int i = 0; i < qsize; i++) {
			b[i]= q1.poll();
		}
		Arrays.sort(b);
		
		
		for (int i = 0; i < b.length; i++) {
			if(b[i]==0)break;
			System.out.println(b[i]);
		}



	}
}

