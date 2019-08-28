package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _notyetN_Queen {

	static int [][]map;
	static int cnt;
	static boolean [][]visit;
	static int k = 1; 
	static int sol = 1; 
	
	public static void N_queen (int node) {
		
		if (node >= cnt ) {
			sol++;
			return ;
		}
	//------------------------------------------
		for (int i = node; i < cnt; i++) {
				
			
			if (map[node][i] == 0 && !visit[node][i] ) {
				visit[node][i] = true;
				N_queen(node);
			}
			
			
		}
		
		
		
	}
	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String tmp = br.readLine();
		cnt = Integer.parseInt(tmp);
		map = new int[cnt][cnt];
		visit = new boolean[cnt][cnt];
		N_queen(0);
		
				




	}





}
