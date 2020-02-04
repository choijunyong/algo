package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jihacheol {

	static int ver, tar;
	static int [][]map;
	static int [][]visit;
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		ver = Integer.parseInt(st.nextToken());
		tar = Integer.parseInt(st.nextToken());
		map = new int [ver+1][ver+1];
		visit = new int [ver+1][ver+1];
		
		
		for (int i = 1; i <= ver; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < ver; j++) {
				map[i][j+1] = Integer.parseInt(st.nextToken());
			}
		}
		


	}

}
