package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11403_1 {
	static int cnt;
	static boolean visit[][];
	static int arr[][];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st= new StringTokenizer(br.readLine());
		cnt = Integer.parseInt(st.nextToken());
		arr = new int [cnt+1][cnt+1];
		visit = new boolean[cnt+1][cnt+1];


		for (int i = 1; i <= cnt; i++) {

			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= cnt; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());			
			}

		}

		for (int i = 1; i <= cnt; i++) {
			for (int j = 1; j <= cnt; j++) {
				if (arr[i][j] == 1 && !visit[i][j]) {
					DFS(i,j);
				}
			}
		}
		
		for (int i = 1 ; i <= cnt; i++) {
			for (int j = 1; j <= cnt; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void DFS(int node , int y) {// 2, 7 
		
		visit[node][y] = true;
		arr[node][y] = 1;
		for (int i = 1; i <= cnt; i++) {
			if (!visit[node][i] && arr[y][i] == 1){
				DFS(node,i);
			}	
		}
		
		
		
	}
}