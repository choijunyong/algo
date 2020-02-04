package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class hemilton {
	
	static int map[][];
	static int visit[][];
	static int row,col;
	static LinkedList<Integer> l = new LinkedList<Integer>();


	public static void dfs(int node, int cost, int node2)
	{
		
		
		
		
		
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ; 
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		map = new int [cnt][cnt];
		visit = new int [cnt][cnt];
		for (int i = 0; i < args.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < args.length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}
}
