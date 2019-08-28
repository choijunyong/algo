package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOF_17144_misae {


	static int [][]map;
	static int [][]Nmap;
	static int R,C,T;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static int mv[] = {1};
	static Queue<pair>q = new LinkedList<pair>();

	public static void spread_Dust(int x, int y) {

		int cnt = 0;
		int curX = x;
		int curY = y;

		for (int i = 0; i < dx.length; i++) {

			int NX = curX + dx[i];
			int NY = curY + dy[i];

			// 범위 , 진공 청소기 일때 넘김.
			if (NX <= 0 || NX > R || NY <= 0 ||NY > C || map[NX][NY] == -1 ){
				continue;
			}

			if (map[NX][NY] >= 0) {

				//새로운 배열에 해줌
				Nmap[NX][NY] =  Nmap[NX][NY] + map[curX][curY] / 5;
				cnt++;
			}
		}
		// 원래 배열의 값에서 퍼진만큼 뺀다.
		map[curX][curY]= map[curX][curY] - (map[curX][curY] / 5 * cnt);

	}

	public static void gonggi(int num) {

		if (num == 1) {
			
		
			
			
			
		}
		else {
			
			
		}
		
		
		


	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map = new  int[R+1][C+1];
		Nmap = new int[R+1][C+1];

		for (int i = 1; i <= R ; i++) {

			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				if (map[i][j] != 0) {
					spread_Dust(i,j);
				}
			}
		}

		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				map[i][j] = Nmap[i][j] + map[i][j] ;

			}

		}

		// 공기 청정기 가동 
		int cnt1 = 1 ;
		for (int i = 0; i < T; i++) {
			for (int j = 1; j <= R; j++) {
				for (int j2 = 1; j2 <= C; j2++) {

					if (map[j][j2] == -1 ) {
						
						gonggi(cnt1);
						cnt1 ++;
					}
					
					if (cnt1 == 2) {
						return;
					}
				}
			}
		}
		int max = 0;
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				max = map[i][j] + max;
			}
		}
		System.out.println(max);
		
		

	}

}

//for (int i = 1; i <= R; i++) {
//for (int j = 1; j <= C; j++) {
//	System.out.print(map[i][j]+" ");
//
//}
//System.out.println();
//}


class pair {
	int y;
	int x;

	public pair(int x, int y) {
		this.y = y;
		this.x = x;
	}

}



