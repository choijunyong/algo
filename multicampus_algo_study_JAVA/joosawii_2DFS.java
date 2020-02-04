package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joosawii_2DFS  {
	static int cnt;
	static int hap;
	static int []sel = new int[10];
	

	public static void dfs(int ran, int sum )
	{
		if (ran == cnt) {
		
			if (hap == sum) 
			{
				
				for (int i = 0; i < cnt; i++) {
					System.out.print(sel[i]+" ");
				}
				System.out.println();
			}
			return;
		}
		
		for (int i = 1; i <= 6; i++) {
			sel[ran] = i;
			dfs(ran+1,sum+i);
		}



	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		cnt = Integer.parseInt(st.nextToken());
		hap = Integer.parseInt(st.nextToken());
		dfs(0,0);
	}

}
