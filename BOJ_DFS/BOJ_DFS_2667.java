package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_DFS_2667 {

	static boolean visit[][];
	static int map[][];
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static  int cnt;
	static int resultCnt;
	static int resultNode = 0;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		cnt = Integer.parseInt(st.nextToken());
		visit  = new boolean [cnt][cnt];
		map = new int[cnt][cnt];
		resultCnt = 0;
		
		for (int i = 0; i < cnt; i++) {
			
			String tmp = br.readLine();
			for (int j = 0; j < cnt; j++) {
				map[i][j]= tmp.charAt(j)-'0';
			}
			
		}
		for (int i = 0; i < cnt; i++) {
			
			for (int j = 0; j < cnt; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					
					resultCnt ++;
					dfs(i,j);
					arr.add(resultNode);
					resultNode =0;
				}
			}
			
		}
		Collections.sort(arr);
		System.out.println(resultCnt);
		for(int data : arr) {
			System.out.println(data);
		}	
	}
	
	static public void dfs(int x, int y ) {
		visit[x][y] = true;
		map[x][y] =resultCnt;
		resultNode++;
		
		for (int k = 0; k < dx.length; k++) {
		
			int nx = x + dx[k];
			int ny = y + dy[k];
			if(nx < 0 || nx >= cnt || ny < 0 || ny >= cnt) continue;
	
			if(!visit[nx][ny] && map[nx][ny] == 1)
			{	
				dfs(nx,ny);
			}
				
		}
		
		
	}

}
