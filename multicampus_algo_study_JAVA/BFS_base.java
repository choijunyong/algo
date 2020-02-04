package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_base {

	
	static int [][]map;
	static boolean []visit;
	static int ver,edge;
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void bfs(int node) {
		q.add(node);
		visit[node] = true;  
		int a;
		while(!q.isEmpty())
		{
			a = q.poll();
			System.out.print(a+" ");
			
			for (int i = 1; i <= edge; i++) {
			
					if (map[i][0] == a && !visit[map[i][1]]) {
						q.add(map[i][1]);
						visit[map[i][1]] = true;
				}
					if (map[i][1] == a && !visit[map[i][0]]) {
						q.add(map[i][0]);
						visit[map[i][0]] = true;
				}
			}
			
			
			
			
		}
	
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		ver = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		map = new int[edge+1][edge+1];
		visit = new boolean[ver+1];
		for (int i = 1; i <= edge; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[i][0] = x;
			map[i][1] = y;
		
		}
	
	
			for (int i = 1; i <= edge; i++) {
				System.out.print(map[i][0]+" "+map[i][1]);
				System.out.println();
			}
			
		
			bfs(1);
		}
		
	}


