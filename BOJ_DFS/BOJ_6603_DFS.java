package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_6603_DFS {

	static int cnt;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			cnt = Integer.parseInt(st.nextToken());
			if(cnt == 0) break;
			int arr[] = new int [cnt+1];
			boolean visit[] = new boolean [cnt+1];
			for (int i = 1; i <= cnt; i++) {
				arr[i]  = Integer.parseInt(st.nextToken());
			}

			dfs(arr,visit,1,0);
			System.out.println();
		}

	}

	static public void dfs(int arr[],boolean visit[], int start , int depth) {
		if(6 == depth) {
			print(arr,visit);
			return;
		}

		for (int i = start; i <= cnt; i++) {
			visit[i] = true;
			dfs(arr,visit,i+1,depth+1);
			visit[i] = false;
		}
	}
	static public void print(int arr[], boolean visit[]) {
		for (int i = 1; i <= cnt; i++) {
			if(visit[i])
				System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
