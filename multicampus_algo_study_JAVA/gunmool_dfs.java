package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class gunmool_dfs {

	
	
	static int [][]map;
	static boolean [] chk;
	static int cnt;
	static int sum;
	static int result;
	static int min= 999999999;

	static LinkedList<Integer> l = new LinkedList<Integer>();
	public static void dfs(int num, int sum1)
	{
		if (num >= cnt) {
			min = Math.min(sum1, min);
			return;
		}
		for (int i = 0; i < cnt; i++) {
			if (chk[i]) {
				continue;
			}
			if (sum > min)return;
			chk[i] = true;
			dfs(num+1,sum1+map[num][i]);
			chk[i] = false;
		
			
			
		}
		
		
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		cnt = Integer.parseInt(st.nextToken());
		map = new int [cnt][cnt];
		chk= new boolean [cnt];
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < cnt; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
	System.out.println(min);
		
	}

}
