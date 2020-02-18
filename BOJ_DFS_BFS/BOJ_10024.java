package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_10024 {

	static boolean visit[][];
	static char map[][];
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static int cnt;
	static char compare;
	static Queue<PAIR123456>q = new LinkedList<PAIR123456>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		cnt = Integer.parseInt(tmp);
		visit = new boolean[cnt][cnt];
		map = new char[cnt][cnt];
		int cnt1 = 0;

		for (int i = 0; i < cnt; i++) {
			String tmp1 = br.readLine();

			for (int j = 0; j < cnt; j++) {
				map[i][j]= tmp1.charAt(j);
			}
		}

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if(!visit[i][j]) {
					q.add(new PAIR123456(i, j));
					visit[i][j] = true;
					compare = map[i][j];
					bfs();
					cnt1++;
				}
			}
		}
		System.out.print(cnt1+" ");
		
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (map[i][j]=='R') {
					map[i][j] = 'G';
				}
			}
		}
		visit = new boolean[cnt][cnt];
		cnt1 = 0;
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if(!visit[i][j]) {
					q.add(new PAIR123456(i, j));
					visit[i][j] = true;
					compare = map[i][j];
					bfs();
					cnt1++;
				}
			}
		}
		System.out.print(cnt1+" ");
	}

	public static void bfs() {

		while (!q.isEmpty()) {
			PAIR123456 p = q.poll();
			int cx = p.x;
			int cy = p.y;
			for (int i = 0; i < dx.length; i++) {

				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (nx < 0 || nx >= cnt || ny < 0 || ny >= cnt) continue;
				
				if(!visit[nx][ny] && map[nx][ny] == compare) {
					q.add(new PAIR123456(nx, ny));
					visit[nx][ny] = true;
				}
			}
		}
	}
}

class PAIR123456 {
	int x; 
	int y;
	public PAIR123456(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}