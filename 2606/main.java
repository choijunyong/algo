package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class main {
	static Queue <Integer>q = new LinkedList<Integer>();
	static int []dx= {-1,1,0,0};
	static int []dy= {0,0,-1,1};
	static int [][]map;
	static boolean []visit;
	static int ver,edge, cnt;

	static int bfs(int x)
	{
		q.add(x);
		cnt = 0;
		visit[x]= true;
		while(!q.isEmpty())
		{
			int b= q.poll();
			for (int i = 1; i <= ver; i++) {

				if (map[b][i] ==1 && visit[i]== false) 
				{
					
					visit[i] = true;
					q.add(i);
					cnt++;
				
				}	
			}

		}
		return cnt;
	}

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(bf.readLine());
		ver=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		edge=Integer.parseInt(st.nextToken());
		map = new int [ver+1][ver+1]; 
		visit = new boolean[ver+1];
		for (int i = 0; i < edge; i++) {
			st = new StringTokenizer(bf.readLine());
			int temp1 =Integer.parseInt(st.nextToken());
			int temp2 = Integer.parseInt(st.nextToken());
			map[temp1][temp2] = 1;
			map[temp2][temp1] = 1;

		}
		for (int i = 1; i <= ver; i++) {
			for (int j = 1; j <= ver; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println(bfs(1));


	}
}

