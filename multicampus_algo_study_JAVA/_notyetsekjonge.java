package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _notyetsekjonge {

	static int [][]map;
	static boolean [][] visit;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		map = new int[y+1][x+1];
		visit = new boolean[y+1][x+1];

		for (int i = 0; i < k; i++) 
		{

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				int y1 = Integer.parseInt(st.nextToken());
				int x1 = Integer.parseInt(st.nextToken());
				map[y1][x1] = 1;
			}

		}

		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}

}
