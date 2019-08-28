package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class miro {

	static int [][]map; 
	static boolean [][]visit;
	static int curX,curY,X,Y,TarX,TarY;
	static Queue<Integer> q = new LinkedList<Integer>();
	static int []dx = {0,0,1,-1};
	static int []dy = {1,-1,0,0};
	public static void bfs(int x,int y ) {

		int NX,NY;
		q.add(x);
		q.add(y);
		visit[y][x] = true;
		while (!q.isEmpty()) {

			int curX1 = q.poll();
			int curY1 = q.poll();
				if (curX1== TarX &&TarY == curY1) {
					System.out.println(map[curY1][curX1]);
					return;

				}
			for (int i = 0; i < dx.length; i++) {
				NX = curX1 +dx[i];
				NY = curY1 + dy [i];
				if (NX<=0 || NX > X || NY<=0 ||NY>Y) {
					continue;
				}
				if (map[NY][NX] == 0 && !visit[NY][NX]) { 
					q.add(NX);
					q.add(NY);
					visit[NY][NX] = true;
					map[NY][NX] = map[curY1][curX1] +1;
				}
			}

		}

		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		map = new int [Y+2][X+2];
		visit = new boolean[Y+2][X+2];
		st = new StringTokenizer(br.readLine());
		curX = Integer.parseInt(st.nextToken());
		curY = Integer.parseInt(st.nextToken());
		TarX = Integer.parseInt(st.nextToken());
		TarY = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= Y; i++) {
			char[] line = br.readLine().toCharArray();
			
			for (int j = 0; j <line.length; j++) {
				map[i][j+1] = line[j]-'0';
			}
		}

		bfs(curX,curY);


	}

}
